

object Q4 {
  def InsertionSort(xs: List[Int]): List[Int] = {
      if (xs.isEmpty) 
        Nil
      else 
        Q3.sortInsert(xs.head, InsertionSort(xs.tail))
  }

}