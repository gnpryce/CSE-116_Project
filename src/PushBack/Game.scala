package PushBack

import PushBack.objects._
import PushBack.physics._
import play.api.libs.json.{JsValue, Json}

class Game {

  val world: World = new World(10)
  var lastUpdateTime: Long = System.nanoTime()

  val gridWidth: Int = 30
  val gridHeight: Int = 20


  var playersInTheGame: Map[String, Player] = Map()
  val playerSize: Double = 0.3
  val playerStart = new GridLocation(15, 10)

  def addPlayer(username: String): Unit = {
    val player = new Player(startingVector(), new Vector(0, 0))
    playersInTheGame += (username -> player)
    world.objects = player :: world.objects
  }

  def removePlayer(username: String): Unit = {
    playersInTheGame(username).destroyObject()
    playersInTheGame -= username
  }

  def startingVector(): Vector = {
    new Vector(playerStart.x + 0.5, playerStart.y + 0.5)
  }

  val deadVector: Vector = new Vector(0, 0)

  def loadGame(): Unit = {
    playersInTheGame.values.foreach(player => player.location = startingVector())
  }

  def checkForDestroyedPlayers(): Unit = {
    val time: Long = System.nanoTime()
    val changeInTime = (time - this.lastUpdateTime) / 1000000000.0
    for (player <- playersInTheGame.values){
      if (player.pushValue == true) {
        if (Physics.detectContact(player, world.objects, changeInTime)) {

          player.location = deadVector
          player.destroyObject()
        }
      }
    }
  }

  def update(): Unit = {
    val time: Long = System.nanoTime()
    val changeInTime = (time - this.lastUpdateTime) / 1000000000.0
    Physics.updateWorld(this.world, changeInTime)
    world.objects = world.objects.filter(player => !player.destroyed)
    this.lastUpdateTime = time
  }

  def gameState(): String = {
    val gameState: Map[String, JsValue] = Map(
      "gridSize" -> Json.toJson(Map("x" -> gridWidth, "y" -> gridHeight)),
      "start" -> Json.toJson(Map("x" -> playerStart.x, "y" -> playerStart.y)),
      "players" -> Json.toJson(this.playersInTheGame.map({ case (k, v) => Json.toJson(Map(
        "x" -> Json.toJson(v.location.x),
        "y" -> Json.toJson(v.location.y),
        "v_x" -> Json.toJson(v.velocity.x),
        "v_y" -> Json.toJson(v.velocity.y),
        "username" -> Json.toJson(k)))
      })
      )
    )
    Json.stringify(Json.toJson(gameState))
  }

}