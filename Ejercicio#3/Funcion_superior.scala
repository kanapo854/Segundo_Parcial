
object ordSupRec{
   def fibo3(n:Int):Int={
      if(n<3) if(n<1) 0
               else 1
      else fibo3(n-1)+fibo3(n-2)+fibo3(n-3)
   }

   def fibo(n:Int):Int={
      if(n<2) n
      else fibo(n-1)+fibo(n-2)
   }

   def funSup(funciontipo:(Int)=>Int,i:Int):Unit={
      for( a <- 1 to i){
         println( funciontipo(a) );
      }
   }

   def main(args:Array[String]):Unit ={
      val a=scala.io.StdIn.readInt()
      println("Fibonacci 2")
      funSup(fibo,a)
      println("Fibonacci 3")
      funSup(fibo3,a)
   }
}


object ordSupEst{
   def fib2( n : Int ) : Int = {
      var a = 0
      var b = 1
      var i = 0	  
   
      while( i < n ) {
         val c = a + b
         a = b
         b = c
         i = i + 1
      } 
      return a
   }
   def fib3( n : Int ) : Int = {
      var a = 0
      var b = 1
      var c = 1
      var i = 0	  
   
      while( i < n ) {
         val d = a + b +c
         a = b
         b = c
         c = d
         i = i + 1
      } 
      return a
   }
   def funSup(funciontipo:(Int)=>Int,i:Int):Unit={
      for( a <- 1 to i){
         println( funciontipo(a) );
      }
   }

   def main(args:Array[String]):Unit ={
      val a=scala.io.StdIn.readInt()
      println("Fibonacci 2")
      funSup(fib2,a)
      println("Fibonacci 3")
      funSup(fib3,a)
   }     
}
