

object Q3 {
  def sortInsert(x: Int, xs: List[Int]): List[Int] =
      if (xs.isEmpty || x <= xs.head)
        x :: xs
      else 
        xs.head :: sortInsert(x, xs.tail)

}