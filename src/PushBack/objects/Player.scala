package PushBack.objects

import PushBack.physics._
import PushBack.physics.PhysicalObject
import scalafx.scene.paint.Color
import scalafx.scene.shape.Circle

class Player (location: Vector, velocity: Vector, var circle: Circle, val userName: String, var push: Int)
  extends PhysicalObject(location, velocity) {

  val playerCircleRadius: Double = 20
  val playerSpeed: Double = 10

  var leftKeyHeld = false
  var rightKeyHeld = false
  var upKeyHeld = false
  var downKeyHeld = false

  def playerSprite(player: Player, color: Color): Circle = {
    player.circle = new Circle {
      centerX = player.location.x
      centerY = player.location.y
      radius = player.playerCircleRadius
      fill = color
    }
    player.circle
  }

  def leftPressed(): Unit = {
    this.leftKeyHeld = true
    this.velocity.x = this.playerSpeed
    this.location.x -= this.velocity.x
    this.circle.centerX_=(this.location.x)
    println(leftKeyHeld)
    println(location.x, location.y)
  }

  def rightPressed(): Unit = {
    this.rightKeyHeld = true
    this.velocity.x = this.playerSpeed
    this.location.x += this.velocity.x
    this.circle.centerX_=(this.location.x)
    println(rightKeyHeld)
    println(location.x, location.y)
  }

  def upPressed(): Unit = {
    this.upKeyHeld = true
    this.velocity.y = this.playerSpeed
    this.location.y -= this.velocity.y
    this.circle.centerY_=(this.location.y)
    println(upKeyHeld)
    println(location.x, location.y)
  }

  def downPressed(): Unit = {
    this.downKeyHeld = true
    this.velocity.y = this.playerSpeed
    this.location.y += this.velocity.y
    this.circle.centerY_=(this.location.y)
    println(downKeyHeld)
    println(location.x, location.y)
  }

  def leftReleased(): Unit = {
    this.leftKeyHeld = false
    this.playerStop()
  }

  def rightReleased(): Unit = {
    this.rightKeyHeld = false
    this.playerStop()
  }

  def upReleased(): Unit = {
    this.upKeyHeld = false
    this.playerStop()
  }

  def downReleased(): Unit = {
    this.downKeyHeld = false
    this.playerStop()
  }

  def playerStop(): Unit = {
    this.velocity.x = 0.0
    this.velocity.y = 0.0
  }
}