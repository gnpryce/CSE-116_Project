package PushBack

object Player {
  def keyPressed(keyCode: KeyCode): Unit = { keyCode.getName match {
    case "Up" => player.translateY.value -= playerSpeed
    case "Left" => player.translateX.value -= playerSpeed
    case "S" => player.translateY.value += playerSpeed
    case "D" => player.translateX.value += playerSpeed
    case _ => println(keyCode.getName + " pressed with no action")

}