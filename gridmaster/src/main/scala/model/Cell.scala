package model

//******* CELL *******
class Cell {
  var tile : Option[Tile] = None
  var moveOption = false
  
  def show = {
      tile match {
        case Some(tile) => tile.show
        case None =>
          if (moveOption) "[*]"
          else "[ ]"
      }
    }
  
  def reset {
      tile = None
      moveOption = false
  }
  
  def acceptTile(t: Tile) {
      tile = Some(t)
    }
  
  def setMoveOption(option: Boolean) = {
      tile match {
        case Some(tile) => moveOption = false
        case None       => moveOption = option
      }
      moveOption
    }
  
  def setTileInactive(myRow: Int, myCol: Int) {
      tile match {
        case Some(tile) => {
          tile.active = false
          moveOption = false
          Board.markMoveOptions(myRow + 1, myCol + 1, false)
        }
        case None => return
      }
    }
}