
object tempEstruc{
// Main method
   def main(args:Array[String]):Unit={ 
      val x=scala.io.StdIn.readInt()
      var i=0
      var a=0
      var b=1
      var b1=1
      var c=0   
      val fib2 = (n:Int) => 
      while( i < n ) {
         c=a+b
         a=b
         b=c
         println(a)
         i=i+1
      } 
      val fib3 = (n:Int) =>
      while( i < n ) {
         c=a+b+b1
         a=b
         b=b1
         b1=c
         println(a)
         i=i+1
      }
      //println(fib2(x))
      println(fib3(x))
   }
}

object tempRec{
   def uni(n:Int,f:Int=>Int)=f(n)

   def main(args:Array[String]):Unit={
      val p=uni(3, n=>n*n)
      val f=uni(3, n=>if(n<2) n else uni(n-1)+uni(n-2))
      println(p)
      println(f)
   }
}
