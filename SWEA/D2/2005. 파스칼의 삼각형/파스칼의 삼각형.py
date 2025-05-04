T=int(input())
for tc in range(1,T+1):
    N=int(input())
    
    arr=[]
    #가변배열(행마다 열의 개수 다른 형태의 배열)
    for i in range(N):
        arr.append([0]*(i+1))
    
    print('#{}'.format(tc))
    for i in range(N):
        for j in range(i+1):
            if j==0 or j==i:
                arr[i][j]=1
            else:
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j]   
            print(arr[i][j],end=" ")
        print(" ")