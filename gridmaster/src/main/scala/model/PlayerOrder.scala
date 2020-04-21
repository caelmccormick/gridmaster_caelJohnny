package model

//******* PLAYER_ORDER *******
object PlayerOrder extends scala.collection.mutable.Queue[Player] {
  var freePlayMoves = 0
  reset
  
  def reset {
    this.clear
    this += new Player("Orange")
    this += new Player("Magenta")
    this += new Player("Lime")
    this += new Player("Aqua")
    freePlayMoves = 0
  }

  def advance {
    this += this.dequeue
  }

  def show: String = {
    var result = ""
    for (p <- this.toArray)
      result += p.name + ", "
    result.substring(0, result.length - 2)
  }

  def checkForWinner: String = {
    for (p <- this) {
      if (p.score >= 100) {
        return p.name
      }
    }
    return "none"
  }

  def current: Player = {
    return this.head
  }

  val playerList: List[Player] = {
    PlayerOrder.toList
  }

  def removeCurrent = {
    val removedPlayer = this.dequeue()
  }

  def doMove: Boolean = {
    val isFreePlayMove : Boolean = if (freePlayMoves > 0) true else false      
    if (isFreePlayMove) { freePlayMoves -= 1 }
    var (success, winner) = PlayerOrder.current.doMove(isFreePlayMove) 
    if (winner) return winner
    
    if (!success) { // no move options
      removeCurrent
      freePlayMoves = this.length
    } else { advance }

    winner
  }
}