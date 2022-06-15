from functools import reduce
  
fibo = lambda n: reduce(lambda x, _: x+[x[-1]+x[-2]],
                                range(n-2), [0, 1])

fibo3 =lambda n: reduce(lambda x, _: x+[x[-1]+x[-2]+x[-3]],
                                range(n-3),[0,1,1])



n=int(input("Ingresa un número: "))
print(fibo3(n))