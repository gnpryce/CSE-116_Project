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
    this.leftPressed()
  }

  def rightPressed(): Unit = {
    this.rightKeyHeld = true
    this.rightPressed()
  }

  def upPressed(): Unit = {
    this.upKeyHeld = true
    this.upPressed()
  }

  def downPressed(): Unit = {
    this.downKeyHeld = true
    this.downPressed()
  }

  def leftReleased(): Unit = {
    this.leftKeyHeld = false
    this.leftReleased()
  }

  def rightReleased(): Unit = {
    this.rightKeyHeld = false
    this.rightReleased()
  }

  def upReleased(): Unit = {
    this.upKeyHeld = false
    this.upReleased()
  }

  def downReleased(): Unit = {
    this.downKeyHeld = false
    this.downReleased()
  }
}