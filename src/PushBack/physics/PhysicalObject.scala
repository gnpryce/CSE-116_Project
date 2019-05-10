package PushBack.physics

class PhysicalObject(var location: Vector, var velocity: Vector) {

  var destroyed = false

  def destroyObject(): Unit = {
    destroyed = true
  }

}
