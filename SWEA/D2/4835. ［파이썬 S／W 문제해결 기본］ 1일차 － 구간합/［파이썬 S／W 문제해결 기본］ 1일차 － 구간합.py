T=int(input())
for tc in range(1,T+1):
    N,M=map(int,input().split())
    data=list(map(int,input().split()))
    s_lst=[]
    i=0
    while N>=i+M:
       x=sum(data[i:i+M])
       #print(f'i : {i}, x: {x}')
       s_lst.append(x)
       i+=1

    #print(s_lst)

    print(f'#{tc} {max(s_lst)-min(s_lst)}')