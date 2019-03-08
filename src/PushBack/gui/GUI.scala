package PushBack.gui

//import javafx.scene.input.KeyCode
import scalafx.application.JFXApp

object GUI extends JFXApp {

  val windowWidth: Double = 1600
  val windowHeight: Double = 1200

  val playerCircleRadius:Double = 40
  val playerSpeed: Double = 25

  val borderWidths: Double = 1000
  val borderHeights: Double = 1000

  /*def keyPressed(keyCode: KeyCode): Unit = {
    keyCode.getName match {
      case "Up" => player.translateY.value -= playerSpeed
      case "Left" => player.translateX.value -= playerSpeed
      case "Down" => player.translateY.value += playerSpeed
      case "Right" => player.translateX.value += playerSpeed
      case _ => println(keyCode.getName + " pressed with no action")
    }
  }*/
}
