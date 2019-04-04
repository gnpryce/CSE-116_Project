package PushBack

import PushBack.objects._

class Game {

  val gridWidth: Double = 15
  val gridHeight: Double = 20

  val player1 = new Player (
    new Vector(gridWidth / 3.0, 0),
    new Vector(0, 0),
    "PLAYER 1",
    5
  )
}

object Game {

  def declareTheWinner: Unit = {

  }

  def elimination: Unit = {

  }

  def detectContact(player1: Player, player2: Player): Boolean = {
    val seg = math.sqrt(math.pow(player1.location.x - player2.location.x, 2) + math.pow(player1.location.y - player2.location.y, 2))
    if (seg <= player1.playerCircleRadius * 2){
      println("Contact Detected")
      true
    }
    else {
      println("No Contact")
      false
    }
  }

  def pushBack(player1: Player, player2: Player): Vector = {
    var newVec: Vector = new Vector(player1.location.x, player1.location.y)
    val seg = math.sqrt(math.pow(player1.location.x - player2.location.x, 2) + math.pow(player1.location.y - player2.location.y, 2))
    if (seg <= player1.playerCircleRadius * 2){
      newVec = new Vector((player1.location.x + 10) * player2.push,player1.location.y)
    }
    newVec
  }

}
