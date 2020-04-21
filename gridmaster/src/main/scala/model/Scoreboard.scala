package model

object Scoreboard {
  def show = {
    var result = "Scores:\n"
    for (p <- PlayerOrder.toArray)
      result += p.name + " = " + p.score + ", "
    result = result.substring(0, result.length - 2) + "\n"

    if (PlayerOrder.current.score == 100) {
      result += PlayerOrder.current.name + " Wins!\n"
    }

    result
  }
}