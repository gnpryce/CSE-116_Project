package PushBack.objects

class PushPotion(var location: Vector, var multiplier: Int) {

  def usePotion(user: Player): Unit = {
    user.push = user.push * this.multiplier
  }
}
