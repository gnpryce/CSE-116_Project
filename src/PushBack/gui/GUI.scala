package PushBack.gui

import PushBack.{ArrowInputs, Game}
import PushBack.objects._
import javafx.scene.input.KeyEvent
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.{Group, Scene}
import scalafx.scene.paint.Color
import scalafx.scene.shape.{Circle, Shape}

object GUI extends JFXApp {

  var lastUpdateTime: Long = System.nanoTime()

  val game = new Game()

  val scaleFactor: Double = 30.0

  val windowWidth: Double = game.gridWidth * scaleFactor
  val windowHeight: Double = game.gridHeight * scaleFactor

  val borderWidths: Double = 1000
  val borderHeights: Double = 1000

  var sceneGraphics: Group = new Group {}

  val player1Sprite: Shape = playerSprite(game.player1, Color.Gold)

  sceneGraphics.children.add(player1Sprite)

  def playerSprite(player: Player, color: Color): Shape = {
    new Circle {
      player.location.x = Math.random() * PushBack.gui.GUI.windowWidth
      player.location.y = Math.random() * PushBack.gui.GUI.windowHeight
      centerX = player.location.x
      centerY = player.location.y
      radius = player.playerCircleRadius
      fill = color
    }
  }

  this.stage = new PrimaryStage {
    this.title = "PushBack"
    scene = new Scene(windowWidth, windowHeight) {
      content = List(sceneGraphics)

      addEventHandler(KeyEvent.ANY, new ArrowInputs(game.player1))
    }

    val update: Long => Unit = (time: Long) => {
      val dt: Double = (time - lastUpdateTime) / 1000000000.0
      lastUpdateTime = time
      game()

      player1Sprite.translateX.value = game.player1.location.x
      player1Sprite.translateY.value = game.player1.location.y
    }
  }
}
