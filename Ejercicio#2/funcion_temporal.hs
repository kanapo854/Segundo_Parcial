

main = do    
    fibTem :: lambda n=0:
    fibTem 0 = 0
    fibTem 1 = 1
    fibTem n = fibTem (n-1) + fibTem (n-2)
    print(fibTem 7)