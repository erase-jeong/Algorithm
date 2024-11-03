T=10
for tc in range(1,T+1):
    testNo=int(input())
    N,M=map(int,input().split())
    ans=1
    for i in range(M):
        ans*=N
    print(f'#{tc} {ans}')