T=10


for testcase in range(1,T+1):
    testNo=int(input())
    arr2d=[]
    for i in range(100):
        listA=list(map(int,input().split()))
        arr2d.append(listA)
    


    max_value=-99

    #print("행끼리 더하기")
    for i in range(len(arr2d)):
        tmp=0
        for j in range(len(arr2d[0])):
            tmp+=arr2d[i][j]
        
        if tmp>max_value:
            max_value=tmp




    #print("열끼리 더하기")
    for i in range(len(arr2d)):
        tmp=0
        for j in range(len(arr2d[0])):
            tmp+=arr2d[j][i]
        
        if tmp>max_value:
            max_value=tmp

    tmp=0
    #print("대각선1 더하기") #둘다 더해짐
    for i in range(len(arr2d)):
        tmp+=arr2d[i][i]

    if tmp>max_value:
        max_value=tmp


    tmp=0
    #print("대각선1 더하기") #둘다 더해짐
    for i in range(len(arr2d)):
        tmp+=arr2d[i][len(arr2d)-i-1]

    if tmp>max_value:
        max_value=tmp

    print(f'#{testNo} {max_value}')


