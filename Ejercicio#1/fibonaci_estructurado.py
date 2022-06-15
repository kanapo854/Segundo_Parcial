
#funcion que creará la serie de numeros
def serie(n=0):
    for i in range(0,n,1):
        print (fiboEstructurado(i), end=", ")
    return "... "

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
def fiboEstructurado(n=0):
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

print(serie(7))