T=int(input())
for tc in range(1,T+1):
    N,K=map(int,input().split())
    n_list=[0]*(N+1)
    n_list[0]=-9
    k_list=list(map(int,input().split()))
    
    for i in k_list:
        n_list[i]=1

    print(f'#{tc} ',end="")
    for i in range(1,N+1):
        if(n_list[i]==0):
            print(i,end=" ")
            #print(f'#{tc} {i}',end=" ")
    print()