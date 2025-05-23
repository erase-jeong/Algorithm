T=int(input())
for tc in range(1,T+1):
    N=int(input())
    data=list(map(int,input().split()))
    data.sort()
    data_str=""
    for i in data:
        data_str+=str(i)+" "
    print(f'#{tc} {data_str}')