package PushBack

import javafx.event.EventHandler
import javafx.scene.input.KeyEvent
import PushBack.objects.Player

abstract class Controller(player: Player) extends EventHandler[KeyEvent] {

  val LEFT: String
  val RIGHT: String
  val UP: String
  val DOWN: String

  override def handle(event: KeyEvent): Unit = {

    val keyCode = event.getCode
    event.getEventType.getName match {
      case "KEY_RELEASED" => keyCode.getName match {
        case this.LEFT => player.leftReleased()
        case this.RIGHT => player.rightReleased()
        case this.UP => player.upReleased()
        case this.DOWN => player.downReleased()
        case _ =>
      }
      case "KEY_PRESSED" => keyCode.getName match {
        case this.LEFT => player.leftPressed()
        case this.RIGHT => player.rightPressed()
        case this.UP => player.upPressed()
        case this.DOWN => player.downPressed()
        case _ =>
      }
      case _ =>
    }

  }

}

class ArrowInputs(player: Player) extends Controller(player) {

  override val LEFT: String = "Left"
  override val RIGHT: String = "Right"
  override val UP: String = "Up"
  override val DOWN: String = "Down"

}