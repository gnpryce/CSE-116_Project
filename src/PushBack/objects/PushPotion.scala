package PushBack.objects

import PushBack.physics.Vector
import scalafx.scene.paint.Color
import scalafx.scene.shape.{Rectangle, Shape}

class PushPotion(var location: Vector, var multiplier: Int) {

  def usePotion(user: Player): Unit = {
    user.push = user.push * this.multiplier
  }

  def potion(potion: PushPotion, color: Color): Shape = {
    new Rectangle {
      height = 24
      width = 24
      fill = color
    }
  }
}
