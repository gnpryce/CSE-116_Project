package PushBack.physics

object Physics {

  def computePotentialLocation(obj1: PhysicalObject, changeInTime: Double): Vector = {
    val x: Double = obj1.location.x + obj1.velocity.x * changeInTime
    val y: Double = obj1.location.y + obj1.velocity.y * changeInTime

    new Vector(x, y)
  }

  val EPSILON: Double = 0.000000001

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }

  def slope(vector1: Vector, vector2: Vector): Double = {
    if(vector2.x - vector1.x == 0.0){
      100000000000.0
      //      Double.PositiveInfinity
    }else {
      (vector2.y - vector1.y) / (vector2.x - vector1.x)
    }
  }

  def yIntercept(vector: Vector, m: Double): Double = {
    vector.y - m * vector.x
  }

  def detectContact(something: PhysicalObject, objects: List[PhysicalObject], changeInTime: Double): Boolean = {
    for (oneObject <- objects){
      if (computePotentialLocation(something, changeInTime) == oneObject.location){
        println("DETECTED")
        true
      }
    }
    false
  }


  def updateWorld(gameWorld: World, changeInTime: Double): Unit = {

    for (x <- gameWorld.objects) {

      val potentialLocation = computePotentialLocation(x, changeInTime)

      var collisionDetected = false

      if (detectContact(x, gameWorld.objects, changeInTime)){
        collisionDetected = true
      }

      if (!collisionDetected) {
        x.location.x = potentialLocation.x
        x.location.y = potentialLocation.y
      }

    }

    gameWorld.objects = gameWorld.objects.filter((objects: PhysicalObject) => !objects.destroyed)
  }

}
