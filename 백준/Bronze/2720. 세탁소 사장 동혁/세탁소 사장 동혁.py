T=int(input())
for _ in range(T):
    C=int(input())
    
    print(C//25,end=" ")
    print((C%25)//10, end=" ")
    print(((C%25)%10)//5, end=" ")
    print((((C%25)%10)%5)//1)