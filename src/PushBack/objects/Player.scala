package PushBack.objects

import PushBack.physics._

class Player (location: Vector, velocity: Vector)
  extends PhysicalObject(location, velocity) {

  var pushValue = false

  def pushActivate(): Unit = {
    pushValue = true
  }

  val playerCircleRadius: Double = 20
  val playerSpeed: Double = 10

  var leftKeyHeld = false
  var rightKeyHeld = false
  var upKeyHeld = false
  var downKeyHeld = false

  def move(direction: Vector){
    val normalDirection = direction.normal2d()
    velocity = new Vector(normalDirection.x * playerSpeed, normalDirection.y * playerSpeed)
  }

  def playerStop(): Unit = {
    this.velocity.x = 0.0
    this.velocity.y = 0.0
  }
}