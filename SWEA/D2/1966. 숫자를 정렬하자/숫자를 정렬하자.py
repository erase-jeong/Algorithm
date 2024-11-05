T=int(input())
for tc in range(1,T+1):
    N=int(input())
    numList=list(map(int,input().split()))
    numList.sort()
    print(f'#{tc}',end=" ")
    for i in numList:
        print(i,end=" ")
    print()
