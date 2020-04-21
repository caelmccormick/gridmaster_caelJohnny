package view

import scala.swing._
import controller._
import java.awt.{ Color, Graphics2D }

class SimpleView extends MainFrame with View {

  // Components

  // Player Order Panel
  object playerOrder extends TextArea
  object advancePO_Btn extends Button(">> Advance")
  object playerOrderPanel extends FlowPanel {
    contents += new Label("Player Order:")
    contents += playerOrder
    contents += advancePO_Btn
  }

  // Game control buttons Panel
  object initialize_Btn extends Button("Initialize")
  object checkWinner_Btn extends Button("Winner?")
  object doMove_Btn extends Button("Do Move")
  object doTurn_Btn extends Button("Do Turn")
  object doGame_Btn extends Button("Do Game")
  object gameControlsPanel extends BoxPanel(Orientation.Vertical) {
    contents ++= Seq(initialize_Btn, checkWinner_Btn, doMove_Btn, doTurn_Btn, doGame_Btn)
    border = Swing.EmptyBorder(10, 10, 10, 10)
  }

  // Strategy control buttons
  val lime = new Color(57,255,20) // lime green
  val aqua = new Color(188,241,237) // aqua

  object OrangeDefault_Btn extends Button("Orange Default"){
  	background = Color.orange
  }
  object OrangeStrategy2_Btn extends Button("Orange Strategy 2"){
  	background = Color.orange
  }
  object OrangeStrategy3_Btn extends Button("Orange Strategy 3"){
  	background = Color.orange
  }
  object OrangeStrategy4_Btn extends Button("Orange Strategy 4"){
  	background = Color.orange
  }

  object MagDefault_Btn extends Button("Magenta Default"){
  	background = Color.magenta
  }
  object MagStrategy2_Btn extends Button("Magenta Strategy 2"){
  	background = Color.magenta
  }
  object MagStrategy3_Btn extends Button("Magenta Strategy 3"){
  	background = Color.magenta
  }
  object MagStrategy4_Btn extends Button("Magenta Strategy 4"){
  	background = Color.magenta
  }

  object LimeDefault_Btn extends Button("Lime Default"){
  	background = lime
  }
  object LimeStrategy2_Btn extends Button("Lime Strategy 2"){
  	background = lime
  }
  object LimeStrategy3_Btn extends Button("Lime Strategy 3"){
  	background = lime
  }
  object LimeStrategy4_Btn extends Button("Lime Strategy 4"){
  	background = lime
  }

  object AquaDefault_Btn extends Button("Aqua Default"){
  	background = aqua
  }
  object AquaStrategy2_Btn extends Button("Aqua Strategy 2"){
  	background = aqua
  }
  object AquaStrategy3_Btn extends Button("Aqua Strategy 3"){
  	background = aqua
  }
  object AquaStrategy4_Btn extends Button("Aqua Strategy 4"){
  	background = aqua
  }

  import java.awt.Font
  object gameText extends TextArea {
    font = new Font ("Monospaced", Font.BOLD , 12)
  }
  object gameAreaPanel extends ScrollPane(gameText)

 
  object strategyPanel extends GridPanel(4,4) {
    //contents += new Label("Orange Strategies") 
    contents += OrangeDefault_Btn
    contents += OrangeStrategy2_Btn
    contents += OrangeStrategy3_Btn
    contents += OrangeStrategy4_Btn
    contents += MagDefault_Btn
    contents += MagStrategy2_Btn
    contents += MagStrategy3_Btn
   	contents += MagStrategy4_Btn
   	contents += LimeDefault_Btn
    contents += LimeStrategy2_Btn
    contents += LimeStrategy3_Btn
   	contents += LimeStrategy4_Btn
    contents += AquaDefault_Btn
    contents += AquaStrategy2_Btn
    contents += AquaStrategy3_Btn
   	contents += AquaStrategy4_Btn
  }


  // MainFrame contents panel
  import BorderPanel.Position._
  object borderPanel extends BorderPanel {
    layout += playerOrderPanel -> North
    layout += gameControlsPanel -> West
    layout += gameAreaPanel -> Center
    layout += strategyPanel -> South
  }
  
  title = "Grid Master"
  contents = borderPanel
  centerOnScreen

  size = new Dimension(600, 700)

  /**
   * View.init
   * @param controller
   */
  override def init(controller: Controller) {
    super.init(controller)

    update_PlayerOrder
    update_GameArea
    
    advancePO_Btn.action = controller.advanceOrder
    initialize_Btn.action = controller.initialize
    checkWinner_Btn.action = controller.checkForWinner
    doMove_Btn.action = controller.doMove
    doTurn_Btn.action = controller.doTurn
    doGame_Btn.action = controller.doGame
   	//OrangeDefault_Btn = controller.OS1
    //OrangeStrategy2_Btn = controller.OS2
    
    visible = true
  }
  
  def update_PlayerOrder {
    playerOrder.text = controller.get.showPlayerOrder
  }
  
  def update_GameArea {
    gameText.text = controller.get.showGameArea
  }
  
  def showWinner(result: String) {
    Dialog.showMessage(this, result, title="And the winner is...")    
  }

}