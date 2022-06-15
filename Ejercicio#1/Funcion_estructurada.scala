object Hola {
  def maximo(x:Int,y:Int):Int={
    if(x>y) x
 else y 
  }
  
  def fsuperior(funciontipo:(Int,Int)=>Int):Unit={
    println(funciontipo(9,10))
  }
  
  def suma(a:Int, b:Int):Int={
    a+b
  }
  
  def main(args:Array[String]):Unit = {
    println("Hola mundo")
 println("Dame un valor a: ")
 val a = scala.io.StdIn.readInt()
 println("Dame un valor b: ")
 val b = scala.io.StdIn.readInt()
 println("el maximo es: "+ maximo(a,b))
 fsuperior(suma)
  }
}

object recursivo{
   def fibo3(n:Int):Int={
      if(n<3) if(n<1) 0
               else 1
      else fibo3(n-1)+fibo3(n-2)+fibo3(n-3)
   }

   def fibo(n:Int):Int={
      if(n<2) n
      else fibo(n-1)+fibo(n-2)
   }
   def main(args:Array[String]):Unit ={
      val a = scala.io.StdIn.readInt()
      for( a <- 1 to 10){
         println( fibo3(a) );
      }
   }
}

object estructurado{
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
   def main(args:Array[String]):Unit ={
      val a = scala.io.StdIn.readInt()
      for( a <- 1 to 10){
         println( fib3(a) );
      }
      
   }
}

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

