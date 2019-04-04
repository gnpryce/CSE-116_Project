package PushBack.objects

class Player (var location: Vector, var velocity: Vector, val userName: String, var push: Int) {

  val playerCircleRadius:Double = 40
  val playerSpeed: Double = 25

  var leftKeyHeld = false
  var rightKeyHeld = false
  var upKeyHeld = false
  var downKeyHeld = false

  def leftPressed(): Unit = {
    this.leftKeyHeld = true
    this.velocity.x = this.playerSpeed
    this.location.x -= this.velocity.x
    leftPressed()
  }

  def rightPressed(): Unit = {
    this.rightKeyHeld = true
    this.velocity.x = this.playerSpeed
    this.location.x += this.velocity.x
  }

  def upPressed(): Unit = {
    this.upKeyHeld = true
    this.velocity.y = this.playerSpeed
    this.location.y -= this.velocity.y
  }

  def downPressed(): Unit = {
    this.downKeyHeld = true
    this.velocity.y = this.playerSpeed
    this.location.y += this.velocity.y
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