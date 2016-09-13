

object Q2 {
  
  def main(args: Array[String]) :Unit = {

val a1 = List(1,4,7,6,5,10)
val a2 = a1.length/2
println(split(a2,a1))  }



def split(n: Int, l: List[Int]):(List[Int], List[Int]) = {
    def _split(c: Int, rs: List[Int], rm: List[Int]):(List[Int],List[Int]) = (c, rm) match {
        case (_, Nil) => (rs, Nil)
        case (0, rm) => (rs, rm)
        case (c, h::tail) => _split(c - 1, rs:::(List(h)), tail)
    }
    _split(n, List(), l)
}
  
}