package model

import PlayerOrder._


object Strategies {

  def O1 = Menu.setStrategy(PlayerOrder.playerList(0), "firstAvailable")
  def O2 = Menu.setStrategy(PlayerOrder.playerList(0), "aggressive")
  def O3 = Menu.setStrategy(PlayerOrder.playerList(0), "safe")
  def O4 = Menu.setStrategy(PlayerOrder.playerList(0), "moderate")
  def M1 = Menu.setStrategy(PlayerOrder.playerList(1), "firstAvailable")
  def M2 = Menu.setStrategy(PlayerOrder.playerList(1), "aggressive")
  def M3 = Menu.setStrategy(PlayerOrder.playerList(1), "safe")
  def M4 = Menu.setStrategy(PlayerOrder.playerList(1), "moderate")
  def L1 = Menu.setStrategy(PlayerOrder.playerList(2), "firstAvailable")
  def L2 = Menu.setStrategy(PlayerOrder.playerList(2), "aggressive")
  def L3 = Menu.setStrategy(PlayerOrder.playerList(2), "safe")
  def L4 = Menu.setStrategy(PlayerOrder.playerList(2), "moderate")
  def A1 = Menu.setStrategy(PlayerOrder.playerList(3), "firstAvailable")
  def A2 = Menu.setStrategy(PlayerOrder.playerList(3), "aggressive")
  def A3 = Menu.setStrategy(PlayerOrder.playerList(3), "safe")
  def A4 = Menu.setStrategy(PlayerOrder.playerList(3), "moderate")
}