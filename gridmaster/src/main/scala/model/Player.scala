package model


class Player(val name: String) {
  var tiles = 100
  var score = 0

  // starting strategy
  var strategy: String = "firstAvailableRev"

  def setStrategy(strat: String): Unit = {
    var strategy = strat
  }

  def getStrategy(): String = strategy

  def reset = {
    tiles = 100
    score = 0
  }

  def winner: Boolean = if (score == 100) return true else return false

  def nextTile = new Tile(name(0), score + 1)

  // execute a move
  def move(tile: Tile, row: Int, col: Int) {
    Board.acceptTile(tile, row, col)
    tiles -= 1
    score += 1
  }


  
  

  // determine the move result 
  def doMove(freePlay: Boolean): (Boolean, Boolean) = {

    val tile = nextTile
    var success = true

    // *************************   INITIAL MOVE    ******************************************
    if (score == 0) {
      val (row, col) = initialMove
      move(tile, row, col)
    } 


    // *****************************    STRATEGY 1: FIRST AVAILABLE  (don't touch)   *********************************
    else if (strategy == "firstAvailable") {
      if (freePlay) {
        val (row, col) = pickEmptyCell
        move(tile, row, col)
      } 
      else { // normal move
        val (row, col) = pickMoveOption
        if (row == -1) { // no move options
          success = false
        } else { move(tile, row, col) }
      }
    }

    // *****************************    STRATEGY 2: FIRST AVAILABLE REVERSE   *********************************
    else if (strategy == "firstAvailableRev") {
      if (freePlay) {
        val (row, col) = pickEmptyCellReverse
        move(tile, row, col)
      } 
      else { // normal move
        val (row, col) = pickMoveOptionReverse
        if (row == -1) { // no move options
          success = false
        } else { move(tile, row, col) }
      }
    }

    // *****************************    STRATEGY 3: EVERY OTHER EVEN   *********************************
    else if (strategy == "everyOtherEven") {
      if (freePlay) {
        val (row, col) = pickEveryOtherEvenEmptyCell
        move(tile, row, col)
      } 
      else { // normal move
        val (row, col) = pickEveryOtherEvenMoveOption
        if (row == -1) { // no move options
          success = false
        } else { move(tile, row, col) }
      }
    }

    // *****************************    STRATEGY 4: EVERY OTHER ODD   *********************************
    else if (strategy == "everyOtherOdd") {
      if (freePlay) {
        val (row, col) = pickEveryOtherOddEmptyCell
        move(tile, row, col)
      } 
      else { // normal move
        val (row, col) = pickEveryOtherEvenMoveOption
        if (row == -1) { // no move options
          success = false
        } else { move(tile, row, col) }
      }
    }

    // *** see if success ***

    return (success, winner)
  }

  // ********************     INITIAL:  CORNER MOVES    ******************************************
  def initialMove = {
    name match {
      case "Orange"  => (1, 1)
      case "Magenta" => (1, 20)
      case "Lime"    => (20, 1)
      case "Aqua"    => (20, 20)
    }
  }

  // ********************     DEFAULT STRATEGY HELPERS: FIRST AVAILABLE    ******************************************
  def pickEmptyCell: (Int, Int) = {
    var emptyCell = (-1, -1)
    for {
      i <- 0 until Board.rows
      j <- 0 until Board.cols
    } if (Board.isEmptyCell(i, j))
      return (i + 1, j + 1)
    emptyCell
  }

  def pickMoveOption: (Int, Int) = {
    var moveOption = (-1, -1)
    for {
      i <- 0 until Board.rows
      j <- 0 until Board.cols
    } if (Board.isMoveOption(i, j))
      return (i + 1, j + 1)
    moveOption
  }

// ********************     2nd STRATEGY HELPERS: FIRST AVAILABLE REVERSE    ******************************************
  def pickEmptyCellReverse: (Int, Int) = {
    var emptyCell = (20, 20)
    for {
      i <- Board.rows until -1
      j <- Board.cols until -1
    } if (Board.isEmptyCell(i, j))
      return (i - 1, j - 1)
    emptyCell
  }

  def pickMoveOptionReverse: (Int, Int) = {
    var moveOption = (20, 20)
    for {
      i <- Board.rows until -1
      j <- Board.cols until -1
    } if (Board.isMoveOption(i, j))
      return (i - 1, j - 1)
    moveOption
  }

  // ********************     3rd STRATEGY HELPERS: EVERY OTHER EVEN  ******************************************
  def pickEveryOtherEvenEmptyCell: (Int, Int) = {
    var emptyCell = (-1, -1)
    for {
      i <- 0 until Board.rows if i % 2 == 0
      j <- 0 until Board.cols if i % 2 == 0
    } if (Board.isEmptyCell(i, j))
      return (i + 1, j + 1)
    emptyCell
  }

  def pickEveryOtherEvenMoveOption: (Int, Int) = {
    var moveOption = (-1, -1)
    for {
      i <- 0 until Board.rows if i % 2 == 0
      j <- 0 until Board.cols if i % 2 == 0
    } if (Board.isMoveOption(i, j))
      return (i + 1, j + 1)
    moveOption
  }

  // ********************     4th STRATEGY HELPERS: EVERY OTHER ODD ******************************************
  def pickEveryOtherOddEmptyCell: (Int, Int) = {
    var emptyCell = (-1, -1)
    for {
      i <- 0 until Board.rows if i % 2 == 1
      j <- 0 until Board.cols if i % 2 == 1
    } if (Board.isEmptyCell(i, j))
      return (i + 2, j + 2)
    emptyCell
  }

  def pickEveryOtherOddMoveOption: (Int, Int) = {
    var moveOption = (-1, -1)
    for {
      i <- 0 until Board.rows if i % 2 == 1
      j <- 0 until Board.cols if i % 2 == 1
    } if (Board.isMoveOption(i, j))
      return (i + 2, j + 2)
    moveOption
  }


}