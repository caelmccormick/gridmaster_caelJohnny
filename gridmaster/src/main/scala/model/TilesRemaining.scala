package model

object TilesRemaining {
  def show : String= {
    var result = "Tiles In Hand:\n"
    for (p <- PlayerOrder.toArray)
      result += p.name + " = " + p.tiles + ", "
    return result.substring(0, result.length - 2) + "\n"

  }
} 