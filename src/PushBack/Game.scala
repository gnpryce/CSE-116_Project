package PushBack

import PushBack.objects._
import scalafx.scene.shape.Circle

class Game {

  val gridWidth: Double = 30
  val gridHeight: Double = 30


  val player1 = new Player (
    new physics.Vector(100, 100),
    new physics.Vector(0, 0),
    new Circle(),
    "PLAYER 1",
    5
  )

  val player2 = new Player (
    new physics.Vector(300, 200),
    new physics.Vector(0, 0),
    new Circle(),
    "PLAYER 2",
    5
  )

  val testPotion = new PushPotion(
    new physics.Vector(100, 100),
    5
  )

  if (physics.Physics.detectContact(player1,player2)){
    println("DETECTED")
  }

  val playersInTheGame: List[Player] = List()

  def login: Unit = {

  }

  def declareTheWinner: Unit = {

  }

  def elimination: Unit = {

  }
}