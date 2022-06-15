
#funcion que creara la serie
def serie(funcion,n):
    for i in range(0,n+1,1):
        print (funcion(i), end=", ")
    return "... "


def serieFun(funcion,n):
    return funcion(n)

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

# prueba de un fibonacci estructural normal
def fiboEstructurado(n=0):
    if n<2:
        return n
    else:
        a=0
        b=1
        for i in range(n-1):
            c=a+b
            a=b
            b=c
        return c

#funcion del fibo estructurado de 3 digitos
def fiboEstructurado3(n=0):
    if n==0:
        return 0
    if n==1:
        return 1
    if n==2:
        return 1
    else:
        a=0
        b=1
        c=1
        for i in range(n-2):
            d=a+b+c
            a=b
            b=c
            c=d
        return c

print("Orden Superior con Funciones Recursivas")
#print(serie(fibo,7))
print(serie(fibo3,7))
print("Orden Superior con Funciones Estructuradas")
#print(serie(fiboEstructurado,7))
print(serie(fiboEstructurado3,7))