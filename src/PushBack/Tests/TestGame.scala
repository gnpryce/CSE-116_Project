/*package PushBack.Tests

import PushBack.physics
import org.scalatest._
import PushBack.objects.Player
import PushBack.physics.Physics
import scalafx.scene.shape.Circle

class TestGame extends FunSuite {

  test("This is a test for detecting contact between players") {

    val vec: physics.Vector = new physics.Vector(4.0, 2.0)
    val vel: physics.Vector = new physics.Vector(0.0, 5.0)
    val vec2: physics.Vector = new physics.Vector(250.0, 10.0)
    val circle = new Circle()

    val playerA: Player = new Player(vec, vel, circle, "user 1", 5)
    val playerB: Player = new Player(vec, vel, circle, "user 2", 10)
    val playerC: Player = new Player(vec2, vel, circle, "user 3", 5)

    assert(Physics.detectContact(playerA, playerB) == true)
    assert(Physics.detectContact(playerA, playerC) == false)
  }

  test("This is a test for push back") {

    val vec: physics.Vector = new physics.Vector(4.0, 2.0)
    val vel: physics.Vector = new physics.Vector(0.0, 5.0)
    val circle = new Circle()

    val playerA: Player = new Player(vec, vel, circle, "user 1", 5)
    val playerB: Player = new Player(vec, vel, circle, "user 2", 10)

    val goal = (playerA.location.x + 10) * 10

    //assert(Physics.pushBack(playerA, playerB).x == goal)
  }
}
*/