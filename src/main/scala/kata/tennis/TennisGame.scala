package kata.tennis

sealed trait Player

sealed trait Score

case class TennisGame(player1: Score, player2: Score) {

  def play(winner: Player): TennisGame = ???

}


