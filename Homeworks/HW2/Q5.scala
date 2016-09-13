

object Q5 {
  def pivotSort(l : List[Int], n : Int): List[Int] = {
    if (l== Nil)
      l:+ n
    else if (l.head <= n)
      l.head +: pivotSort(l.tail,n)
    else 
      pivotSort(l.tail, n) :+ l.head
      
      
    
  }
}