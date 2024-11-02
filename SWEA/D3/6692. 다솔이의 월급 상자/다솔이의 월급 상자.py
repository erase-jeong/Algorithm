T=int(input())
for tc in range(1,T+1):
    N=int(input())
    pArr=[0]*N
    xArr=[0]*N
    ans=0
    for i in range(N):
        pArr[i],xArr[i]=map(float,input().split())
        ans+=pArr[i]*xArr[i]
    print(f'#{tc} {ans:.6f}')