package PushBack.gui

import javafx.scene.input.KeyCode
import scalafx.application.JFXApp

object Gui extends JFXApp {

  val windowWidth: Double = 800
  val windowHeight: Double = 1200

  val playerCircleRadius:Double = 20
  val playerSpeed: Double = 25

  def keyPressed(keyCode: KeyCode): Unit = {
    keyCode.getName match {
      case "Up" => player.translateY.value -= playerSpeed
      case "Left" => player.translateX.value -= playerSpeed
      case "Down" => player.translateY.value += playerSpeed
      case "Right" => player.translateX.value += playerSpeed
      case _ => println(keyCode.getName + " pressed with no action")
    }
  }
}
