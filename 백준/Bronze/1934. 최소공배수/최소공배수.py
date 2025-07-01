T=int(input())
for _ in range(T):
    A,B=map(int,input().split())
    common=1
    #1은 무의미하니 2부터 시작해도 ok

    for p in range(2,min(A,B)+1):
        while A%p==0 and B%p==0:
            common*=p
            A//=p
            B//=p
        
    #A, B는 서로소가 되었으므로 LCM=common*A*B
    print(common*A*B)