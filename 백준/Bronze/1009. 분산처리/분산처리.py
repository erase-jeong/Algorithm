import sys
t=int(sys.stdin.readline())

for i in range(t):
    a,b=map(int,sys.stdin.readline().split())
    
    
    base=a%10

    if base==0:
        print(10)

    elif base in [1,5,6]:
        print(base)
    
    elif base in [4,9]:
        if b%2==0:
            print(base**2%10)
        else:
            print(base)

    else: #a의 값이 2,3,7,8
        if b%4==0:
            print(base**4%10)
        else:
            print(base**(b%4)%10)

