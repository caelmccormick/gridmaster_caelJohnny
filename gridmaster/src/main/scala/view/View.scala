package view

import controller._

trait View {
  var controller: Option[Controller] = None

  def init(ctr: Controller) {
    controller = Some(ctr)
  }
  
  def update_PlayerOrder
  def update_GameArea
  def showWinner(result: String)

}
