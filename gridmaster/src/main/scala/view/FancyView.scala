package view

import model._
import controller._

import scala.swing._
import event._

class FancyView extends SimpleView {
  
  val gameArea = new BoardCanvas(Board.rows, Board.cols)
  gameArea.init
  
  borderPanel.layout(gameArea) = BorderPanel.Position.Center
  
  override def update_GameArea {
    gameArea.repaint
    gameText.text = controller.get.showGameArea
  }
  

  

  //******* Canvas classes *******

  import java.awt.{ Graphics2D, Color }
  import java.awt.Font

  //******* CellCanvas *******
  class CellCanvas(var cellValue: String) extends Panel {

    def drawTile(g: Graphics2D, color: Color) {
      g.setColor(color)
      g.fillRect(1, 1, size.width - 1, size.height - 1)
      g.setColor(Color.black)
      g.setFont(new Font("SansSerif", Font.BOLD, 11))
      g.drawString(cellValue.substring(1, 3), 7, 15)
    }

    override def paintComponent(g: Graphics2D) {
      g.clearRect(0, 0, size.width, size.height)

      g.setColor(Color.darkGray)
      g.fillRect(0, 0, size.width, size.height)

      if (cellValue == "[ ]") {
        g.setColor(Color.white)
        g.fillRect(1, 1, size.width - 1, size.height - 1)
      }
      if (cellValue == "[*]") {
        g.setColor(Color.gray)
        g.fillRect(1, 1, size.width - 1, size.height - 1)
      }
      if (cellValue.substring(0, 1) == "O" || cellValue.substring(1, 2) == "O") drawTile(g, Color.orange)
      if (cellValue.substring(0, 1) == "M" || cellValue.substring(1, 2) == "M") drawTile(g, Color.magenta)
      if (cellValue.substring(0, 1) == "L" || cellValue.substring(1, 2) == "L") drawTile(g, Color.green)
      if (cellValue.substring(0, 1) == "A" || cellValue.substring(1, 2) == "A") drawTile(g, Color.cyan)
    }

  }

  //******* BoardCanvas *******
  class BoardCanvas(rows: Int, cols: Int) extends GridPanel(rows, cols) {

    val cells = Array.ofDim[CellCanvas](rows, cols)

    def init {
      for {
        i <- 0 until rows
        j <- 0 until cols
      } {
        cells(i)(j) = new CellCanvas(Board.cells(i)(j).show) {
          preferredSize = new Dimension(10, 15)
        }
        contents += cells(i)(j)
      }
    }

    override def repaint {
      super.repaint
      for {
        i <- 0 until rows
        j <- 0 until cols
      } cells(i)(j).cellValue = Board.cells(i)(j).show
    }
  }
}