package model

import org.scalatest.FunSpec
import org.scalatest.Matchers

import model._

class Board_Tests extends FunSpec with Matchers {

  describe("The GridMaster Simulation") {
    describe("has a board") {
      
      
//      it("can accept tile"){
//
//        val orange_1 = new Tile('O', 1)
//        Board.acceptTile(orange_1, 3, 5) // new feature
//
//        val expectedResult1 =
//          "Board:\n" +
//            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
//            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
//            "[ ][ ][ ][ ]O1 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
//            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
//            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
//            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
//            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
//            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
//            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
//            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
//            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
//            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
//            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
//            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
//            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
//            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
//            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
//            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
//            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
//            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
//            "\n" +
//            "Scores:\n" +
//            "Orange = 0, Magenta = 0, Lime = 0, Aqua = 0\n" +
//            "\n" +
//            "Tiles In Hand:\n" +
//            "Orange = 100, Magenta = 100, Lime = 100, Aqua = 100\n\n"
//
//        Menu.showGameArea should be(expectedResult1)
//      }

      //******* Tiles & Move Options *******
      it("can accept tiles and mark move options") {

        val orange_1 = new Tile('O', 1)
        Board.acceptTile(orange_1, 3, 5) // new feature

        val expectedResult1 =
          "Board:\n" +
            "[ ][ ][*][ ][ ][ ][*][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][*][ ][ ]O1 [ ][ ][*][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][*][ ][ ][ ][*][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][*][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "\n" +
            "Scores:\n" +
            "Orange = 0, Magenta = 0, Lime = 0, Aqua = 0\n" +
            "\n" +
            "Tiles In Hand:\n" +
            "Orange = 100, Magenta = 100, Lime = 100, Aqua = 100\n\n"

        Menu.showGameArea should be(expectedResult1)

        val magenta_10 = new Tile('M', 10)
        Board.acceptTile(magenta_10, 1, 1)

        val lime_20 = new Tile('L', 20)
        Board.acceptTile(lime_20, 2, 3)

        val aqua_66 = new Tile('A', 66)
        Board.acceptTile(aqua_66, 20, 1)

        val aqua_99 = new Tile('A', 99)
        Board.acceptTile(aqua_99, 20, 20)

        val expectedResult2 =
          "Board:\n" +
            "M10[ ][*][*][ ][ ][*][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ]L20[ ][ ][*][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][*][*][ ]O1 [ ][ ][*][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[*][ ][ ][ ][*][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][*][ ][ ][ ][*][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][*][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[*][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][*]\n" +
            "[ ][ ][*][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][*][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "A66[ ][ ][*][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][*][ ][ ]A99\n" +
            "\n" +
            "Scores:\n" +
            "Orange = 0, Magenta = 0, Lime = 0, Aqua = 0\n" +
            "\n" +
            "Tiles In Hand:\n" +
            "Orange = 100, Magenta = 100, Lime = 100, Aqua = 100\n\n"

        Menu.showGameArea should be(expectedResult2)
      }

      //******* Inactive tiles *******
      it("can show inactive tiles") {
        Menu.initialize

        val orange_1 = new Tile('O', 1)
        Board.acceptTile(orange_1, 3, 5)

        val expectedResult1 =
          "Board:\n" +
            "[ ][ ][*][ ][ ][ ][*][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][*][ ][ ]O1 [ ][ ][*][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][*][ ][ ][ ][*][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][*][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "\n" +
            "Scores:\n" +
            "Orange = 0, Magenta = 0, Lime = 0, Aqua = 0\n" +
            "\n" +
            "Tiles In Hand:\n" +
            "Orange = 100, Magenta = 100, Lime = 100, Aqua = 100\n\n"

        Menu.showGameArea should be(expectedResult1)

        val magenta_11 = new Tile('M', 11)
        Board.acceptTile(magenta_11, 1, 3)

        val expectedResult2 =
          "Board:\n" +
            "[ ][ ]M11[ ][ ][*][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[*][ ][ ][ ] - [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][*][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "\n" +
            "Scores:\n" +
            "Orange = 0, Magenta = 0, Lime = 0, Aqua = 0\n" +
            "\n" +
            "Tiles In Hand:\n" +
            "Orange = 100, Magenta = 100, Lime = 100, Aqua = 100\n\n"

        Menu.showGameArea should be(expectedResult2)
      }

      //******* Winning tile *******
      it("can show a winning tile, indicated by <P>, with P being the player's initial") {
        Menu.initialize

        val orange_100 = new Tile('O', 100)
        Board.acceptTile(orange_100, 2, 2)

        val expectedResult1 =
          "Board:\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ]<O>[ ][ ][*][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][*][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][*][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "\n" +
            "Scores:\n" +
            "Orange = 0, Magenta = 0, Lime = 0, Aqua = 0\n" +
            "\n" +
            "Tiles In Hand:\n" +
            "Orange = 100, Magenta = 100, Lime = 100, Aqua = 100\n\n"

        Menu.showGameArea should be(expectedResult1)
      }
    }
  }
}