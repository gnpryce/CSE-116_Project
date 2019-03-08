package PushBack

import PushBack.objects._

object Game {

  def declareTheWinner: Unit = {

  }

  def elimination: Unit = {

  }

  def detectContact(player1: Player, player2: Player): Boolean = {
    val seg = math.sqrt(math.pow(player1.location.x - player2.location.x, 2) + math.pow(player1.location.y - player2.location.y, 2))
    if (seg <= gui.GUI.playerCircleRadius * 2){
      println("Contact Detected")
      true
    }
    else {
      println("No Contact")
      false
    }
  }

  def pushBack(player1: Player, player2: Player): Unit = {
    val seg = math.sqrt(math.pow(player1.location.x - player2.location.x, 2) + math.pow(player1.location.y - player2.location.y, 2))
    if (seg <= gui.GUI.playerCircleRadius * 2){
      (player1.location.x + 10) * player2.push
    }
  }

}
