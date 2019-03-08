package Tests
import org.scalatest._
import PushBack.objects.{Player, Vector}

class TestGame extends FunSuite {

  test("This is a test for detecting contact between players") {

    val vec: Vector = new Vector(4.0, 2.0)
    val vel: Vector = new Vector(0.0, 5.0)
    val vec2: Vector = new Vector(12.0, 6.0)
    val playerA: Player = new Player(vec, vel, "user 1", 5)
    val playerB: Player = new Player(vec, vel, "user 2", 10)
    val playerC: Player = new Player(vec2, vel, "user 3", 5)

    assert(PushBack.Game.detectContact(playerA, playerB) == true)
    assert(PushBack.Game.detectContact(playerA, playerC) == false)
  }

  test("This is a test for push back") {
    val vec: Vector = new Vector(4.0, 2.0)
    val vel: Vector = new Vector(0.0, 5.0)
    val vec2: Vector = new Vector(12.0, 6.0)
    val playerA: Player = new Player(vec, vel, "user 1", 5)
    val playerB: Player = new Player(vec, vel, "user 2", 10)

    val goal = (playerA.location.x + 10) * 10

    assert(PushBack.Game.pushBack(playerA, playerB) == goal)
  }
}
