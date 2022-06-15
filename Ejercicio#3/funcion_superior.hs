module Main where 
 
funcSupe ::(Integer -> Integer -> String)->Integer->Integer->String 
funcSupe f x y = f x y 
 

fib :: Integer -> Integer
fib 0 = 0
fib 1 = 1
fib n = fib (n-1) + fib (n-2)

fib3 :: Integer -> Integer
fib3 0 = 0
fib3 1 = 1
fib3 2 = 1
fib3 n = fib3 (n-1) + fib3 (n-2) + fib3 (n-3)

serie :: Integer -> Integer -> String 
serie n m = 
    if n < m-1 then 
        show (fib n) ++ " " ++ serie (succ n) m 
    else 
        show (fib n)


serie3 :: Integer -> Integer -> String 
serie3 x y = 
    if x < y-1 then 
        show (fib3 x) ++ " " ++ serie3 (succ x) y 
    else 
        show (fib3 x)  
 
main = do  
    print (funcSupe serie3 0 5)