T=int(input())
for test_case in range(1,T+1):
    N,M=map(int,input().split())
    list1=[1]*M
    N=N-M
    for i in range(N):
        list1[i]+=1
    
    print(f'#{test_case} {list1.count(1)} {list1.count(2)}')