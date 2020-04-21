package model

//******* TILE *******
class Tile (color : Char, number : Int) {
  var active = true
  
  def show : String = {
    if (active){
      var result : String = color.toString + number.toString
      if (result.length < 3) result += " "
      if (result.length == 4) result = "<" + color.toString + ">"
      return result
    }
    else
    {
      return " - "
    }
    
  }
}