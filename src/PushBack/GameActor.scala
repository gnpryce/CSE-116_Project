package PushBack

import PushBack.physics._
import akka.actor.{Actor, ActorRef}

class GameActor extends Actor {

  var players: Map[String, ActorRef] = Map()

  val game: Game = new Game()

  override def receive: Receive = {
    case message: AddPlayer => game.addPlayer(message.username)
    case message: RemovePlayer => game.removePlayer(message.username)
    case message: MovePlayer => game.playersInTheGame(message.username).move(new Vector(message.x, message.y))
    case message: StopPlayer => game.playersInTheGame(message.username).playerStop()

    case UpdateGame => game.update()
    case SendGameState => sender() ! GameState(game.gameState())
  }
}