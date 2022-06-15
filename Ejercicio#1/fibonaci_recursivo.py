
#funcion que creara la serie
def serie(n=0):
    for i in range(0,n,1):
        print (fibo3(i), end=", ")
    return "... "

#funcion recursiva de fibo normal
def fibo(n=0):
    if n<2:
        return n
    else:
        a=fibo(n-1)+fibo(n-2)
        return a

#funcion de fibo recursivo de 3 digitos
def fibo3(n=0):
    if n==1:
        return 1
    if n==2:
        return 1
    if n==0:
        return 0
    else:
        return fibo3(n-1)+fibo3(n-2)+fibo3(n-3)


print(serie(7))
