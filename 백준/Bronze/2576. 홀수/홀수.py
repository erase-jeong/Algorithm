numList=[]

for i in range(7):
    num=int(input())
    if num%2==1:
        numList.append(num)

if numList:
    print(sum(numList))
    print(min(numList))
else:
    print(-1) #리스트가 비어 있을 경우 처리할 내용