/*package PushBack.gui

import PushBack.{ArrowInputs, Game}
import javafx.scene.input.KeyEvent
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.{Group, Scene}
import scalafx.scene.paint.Color
import scalafx.scene.shape.{Rectangle, Shape}

object GUI extends JFXApp {

  var lastUpdateTime: Long = System.nanoTime()

  val game = new Game()

  val scaleFactor: Double = 30.0

  val windowWidth: Double = game.gridWidth * scaleFactor
  val windowHeight: Double = game.gridHeight * scaleFactor

  var sceneGraphics: Group = new Group {}

  val player1Sprite: Shape = game.player1.playerSprite(game.player1, Color.Gold)
  val player2Sprite: Shape = game.player2.playerSprite(game.player2, Color.Red)
  val potionSprite: Shape = game.testPotion.potion(game.testPotion, Color.Blue)

  sceneGraphics.children.add(player1Sprite)
  sceneGraphics.children.add(potionSprite)
  sceneGraphics.children.add(player2Sprite)

  def leftBoundary(): Shape = {

    val leftBound = new Rectangle {
      width = 0.1 * scaleFactor
      height = 100 * scaleFactor
      fill = Color.Black
      translateX = game.gridWidth + 10
    }
    leftBound
  }

  def topBoundary(): Shape = {
    val topBound = new Rectangle {
      width = 50 * scaleFactor
      height = 0.1 * scaleFactor
      fill = Color.Black
      translateY = game.gridHeight
    }
    topBound
  }

  def rightBoundary(): Shape = {
    val rightBound = new Rectangle {
      width = 0.1 * scaleFactor
      height = 100 * scaleFactor
      fill = Color.Black
      translateX = game.gridWidth + 800
    }
    rightBound
  }

  def bottomBoundary(): Shape = {
    val bottomBound = new Rectangle {
      width = 50 * scaleFactor
      height = 0.1 * scaleFactor
      fill = Color.Black
      translateY = game.gridHeight + 700
    }
    bottomBound
  }

  this.stage = new PrimaryStage {
    this.title = "PushBack"
    scene = new Scene(windowWidth, windowHeight) {
      content = List(sceneGraphics)

      addEventHandler(KeyEvent.ANY, new ArrowInputs(game.player1))
    }

    sceneGraphics.children.add(leftBoundary())
    sceneGraphics.children.add(rightBoundary())
    sceneGraphics.children.add(topBoundary())
    sceneGraphics.children.add(bottomBoundary())
  }
}
*/