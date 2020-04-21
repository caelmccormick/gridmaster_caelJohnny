package model

class Model {
  val menu = Menu

}

object Menu {

  def showGameArea = {
    var result = Board.show + "\n"
    result += Scoreboard.show + "\n"
    result += TilesRemaining.show + "\n"
    result
  }

  def initialize {
    Board.clear
    PlayerOrder.reset
  }

  def showPlayerOrder: String = {
    return PlayerOrder.show
  }

  def advancePlayerOrder: Unit = {
    PlayerOrder.advance
  }

  def checkForWinner: String = {
    PlayerOrder.checkForWinner
  }

  def doMove: Boolean = {
    return PlayerOrder.doMove
  }

  def doTurn: Boolean = {
    for (i <- 1 to PlayerOrder.length) {
      if (doMove) return true // breaks on winner
    }
    return false
  }

  def doGame: Boolean = {
    for (i <- 1 to 400) {
      if (doMove) return true
    }
    return false
  }

  def setStrategy(pl: Player, strategy: String): Unit = {
    pl.setStrategy(strategy)
  }

}
