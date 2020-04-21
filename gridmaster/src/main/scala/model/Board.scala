package model

//******* BOARD *******
object Board {

  // create the 20 x 20 collection of cells
  val rows = 20
  val cols = 20
  val cells = Array.ofDim[Cell](rows, cols)
  for {
    i <- 0 until rows
    j <- 0 until cols
  } cells(i)(j) = new Cell

  // return the String representation of the board
  def show: String = {
    var result = "Board:\n"
    for (i <- 0 until rows) {
      for (j <- 0 until cols)
        result += cells(i)(j).show
      result += "\n"
    }
    result
  }

  // remove all Tiles from the Board
  def clear {
    for {
      i <- 0 until rows
      j <- 0 until cols
    } cells(i)(j).reset
  }

  // add a Tile to the Board
  def acceptTile(tile: Tile, row: Int, col: Int) {
    cells(row - 1)(col - 1).acceptTile(tile)

    inactivateNeighbors(row, col)

    if (markMoveOptions(row, col, true) == 0)
      cells(row - 1)(col - 1).setTileInactive(row - 1, col - 1)
  }

  // make the Tile inactive that was just played from 
  def inactivateNeighbors(row: Int, col: Int) {
    // north
    if (row >= 4) cells(row - 4)(col - 1).setTileInactive(row - 4, col - 1)

    // south
    if (row <= 17) cells(row + 2)(col - 1).setTileInactive(row + 2, col - 1)

    // east
    if (col <= 17) cells(row - 1)(col + 2).setTileInactive(row - 1, col + 2)

    // west
    if (col >= 4) cells(row - 1)(col - 4).setTileInactive(row - 1, col - 4)

    // northwest
    if (row >= 3 && col >= 3) cells(row - 3)(col - 3).setTileInactive(row - 3, col - 3)

    // northeast
    if (row >= 3 && col <= 18) cells(row - 3)(col + 1).setTileInactive(row - 3, col + 1)

    // southeast
    if (row <= 18 && col <= 18) cells(row + 1)(col + 1).setTileInactive(row + 1, col + 1)

    // southwest
    if (row <= 18 && col >= 3) cells(row + 1)(col - 3).setTileInactive(row + 1, col - 3)
  }
  
  // mark all cells that are neighboring as move options
  def markMoveOptions(row: Int, col: Int, option: Boolean) = {
    var count = 0

    if (row >= 4) { // mark north
      if (cells(row - 4)(col - 1).setMoveOption(option)) count += 1
    }

    if (row <= 17) { // mark south
      if (cells(row + 2)(col - 1).setMoveOption(option)) count += 1
    }

    if (col <= 17) { // mark east
      if (cells(row - 1)(col + 2).setMoveOption(option)) count += 1
    }

    if (col >= 4) { // mark west
      if (cells(row - 1)(col - 4).setMoveOption(option)) count += 1
    }

    if (row >= 3 && col >= 3) { // mark northwest
      if (cells(row - 3)(col - 3).setMoveOption(option)) count += 1
    }

    if (row >= 3 && col <= 17) { // mark northeast
      if (cells(row - 3)(col + 1).setMoveOption(option)) count += 1
    }

    if (row <= 17 && col <= 17) { // mark southeast
      if (cells(row + 1)(col + 1).setMoveOption(option)) count += 1
    }

    if (row <= 17 && col >= 3) { // mark southwest
      if (cells(row + 1)(col - 3).setMoveOption(option)) count += 1
    }
    count
  }

  def isMoveOption(row: Int, col: Int): Boolean = {
    if (cells(row)(col).moveOption) true
    else return false
  }

  def isEmptyCell(row: Int, col: Int): Boolean = {
    if (cells(row)(col).show == "[ ]") true
    else return false
  }

}