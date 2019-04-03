package PushBack.gui

//import javafx.scene.input.KeyCode
import PushBack.Game
import scalafx.application.JFXApp

object GUI extends JFXApp {

  var lastUpdateTime: Long = System.nanoTime()

  val game = new Game()

  val scaleFactor: Double = 30.0

  val windowWidth: Double = game.gridWidth * scaleFactor
  val windowHeight: Double = game.gridHeight * scaleFactor

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
