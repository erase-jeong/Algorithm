L=int(input())
N=int(input())
l_lst=[0 for _ in range(L+1)]
n_lst=[[0 for _ in range(2)] for _ in range(N+1)]
expect=[0 for _ in range(N+1)]
actual=[0 for _ in range(N+1)]

for i in range(1,N+1):
    n_lst[i][0],n_lst[i][1]=map(int,input().split())
    expect[i]=n_lst[i][1]-n_lst[i][0]+1

#출력 1번쨰 줄
print(expect.index(max(expect)))


#비어있으면 값을 적는다.
#차있으면 못적는다.

for i in range(1,N+1):
    # 2, 3, 4
    for j in range(n_lst[i][0],n_lst[i][1]+1):
        #print(j)
        if l_lst[j]==0:
            l_lst[j]=i
    #print()
#print(l_lst)

for i in range(1,N+1):
    actual[i]=l_lst.count(i)


#출력 2번째 줄
print(actual.index(max(actual)))