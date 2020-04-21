package controller

import model._
import scala.swing._
import view._

class Controller(model: Model, view: View) {

  def showGameArea: String = {
    model.menu.showGameArea
  }

  def showPlayerOrder: String = {
    model.menu.showPlayerOrder
  }

  def advanceOrder = Action("Advance") {
    model.menu.advancePlayerOrder
    view.update_PlayerOrder
  }

  def initialize = Action("Initialize") {
    model.menu.initialize
    view.update_PlayerOrder
    view.update_GameArea
  }

  def checkForWinner = Action("Winner?") {    
    view.showWinner(model.menu.checkForWinner)
  }

  def doMove = Action("Do Move") {
    val result = model.menu.doMove
    view.update_PlayerOrder
    view.update_GameArea
    if (result) { view.showWinner(model.menu.checkForWinner) }     
  }
  
  def doTurn = Action("Do Turn") {    
    val result = model.menu.doTurn
    view.update_PlayerOrder
    view.update_GameArea
    if (result) { view.showWinner(model.menu.checkForWinner) }    
  }
  
  def doGame = Action("Do Game") {
    val result = model.menu.doGame
    view.update_PlayerOrder
    view.update_GameArea
    if (result) { view.showWinner(model.menu.checkForWinner) }
    
  }

  //Orange strategies

  def OS1 = Action(""){
    model.menu.setStrategy(PlayerOrder.playerList(0), "firstAvailable")
    //Strategies.O1
  }

  def OS2 = Action(""){
    Strategies.O2
  }

  def OS3 = Action(""){
    Strategies.O3
  }

  def OS4 = Action(""){
    Strategies.O4
  }

  //Magenta strategies

  def MS1 = Action(""){
    Strategies.M1
  }

  def MS2 = Action(""){
    Strategies.M2
  }

  def MS3 = Action(""){
    Strategies.M3
  }

  def MS4 = Action(""){
    Strategies.M4
  }

  //Lime strategies

  def LS1 = Action(""){
    Strategies.L1
  }

  def LS2 = Action(""){
    Strategies.L2
  }

  def LS3 = Action(""){
    Strategies.L3
  }

  def LS4 = Action(""){
    Strategies.L4
  }

  //Aqua strategies

  def AS1 = Action(""){
    Strategies.A1
  }

  def AS2 = Action(""){
    Strategies.A2
  }

  def AS3 = Action(""){
    Strategies.A3
  }

  def AS4 = Action(""){
    Strategies.A4
  }

  def exit = Action("Exit") {
    sys.exit(0)
  }

}