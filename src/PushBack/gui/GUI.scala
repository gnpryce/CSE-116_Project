package PushBack.gui

//import javafx.scene.input.KeyCode
import PushBack.Game
import PushBack.objects._
import scalafx.application.JFXApp
import scalafx.scene.paint.Color
import scalafx.scene.shape.{Circle, Shape}

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

  def playerSprite(location: Vector, color: Color): Shape = {
    new Circle {
      location.x = Math.random() * PushBack.gui.GUI.windowWidth
      location.y = Math.random() * PushBack.gui.GUI.windowHeight
      centerX = location.x
      centerY = location.y
      radius = PushBack.gui.GUI.playerCircleRadius
      fill = Color.Gold
    }
  }


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
