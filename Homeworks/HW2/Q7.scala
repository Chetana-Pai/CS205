

object Q7 {
  var result: Int = 1
  def fastPower(x : Int, n : Int): Int ={
    var a1 = x
    var a2 = n
    
    if (a2%2!= 0)
      result = result * a1
      
    if (a2 == 1)
      return result
    a1 = a1 * a1
    a2 = a2/2
    
    fastPower(a1,a2)
    
    
     
      
  }
}