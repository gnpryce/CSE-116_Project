package PushBack.physics

import PushBack.physics
import PushBack.objects.Player

object Physics {

  def computePotentialLocation(obj1: PhysicalObject, changeInTime: Double): Vector = {
    val x: Double = obj1.location.x + obj1.velocity.x * changeInTime
    val y: Double = obj1.location.y + obj1.velocity.y * changeInTime

    new Vector(x, y)
  }

  def detectContact(player1: Player, player2: Player): Boolean = {
    val seg = math.sqrt(math.pow(player1.location.x - player2.location.x, 2) + math.pow(player1.location.y - player2.location.y, 2))
    if (player1.location == player2.location){
      true
    }
    else {
      false
    }
  }

  def pushBack(player1: Player, player2: Player): Unit = {
    var newVec: physics.Vector = new physics.Vector(player2.location.x, player2.location.y)
    val seg = math.sqrt(math.pow(player1.location.x - player2.location.x, 2) + math.pow(player1.location.y - player2.location.y, 2))
    if (seg <= player1.playerCircleRadius * 2){
      newVec = new physics.Vector((player2.location.x + 10) * player1.push,player1.location.y)
    }
    player2.location = newVec
  }

}
