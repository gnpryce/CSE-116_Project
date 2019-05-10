package PushBack.objects

import PushBack.physics.Vector

class PushPotion(var location: Vector, var multiplier: Int) {

  def usePotion(user: Player): Unit = {
    user.pushActivate()
  }

}
