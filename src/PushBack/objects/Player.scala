package PushBack.objects

import scalafx.application.JFXApp
import scalafx.scene.paint.Color
import scalafx.scene.shape.Circle

class Player (var location: Vector, var velocity: Vector, val userName: String, var push: Int) extends JFXApp {
  val player: Circle = new Circle {
    location.x = Math.random() * PushBack.gui.GUI.windowWidth
    location.y = Math.random() * PushBack.gui.GUI.windowHeight
    centerX = location.x
    centerY = location.y
    radius = PushBack.gui.GUI.playerCircleRadius
    fill = Color.Gold
  }
}