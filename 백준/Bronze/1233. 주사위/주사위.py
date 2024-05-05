s1,s2,s3=map(int,input().split())


hapList=[]



for i in range(1,s1+1):
    for j in range(1,s2+1):
        for k in range(1,s3+1):
            hapList.append(i+j+k)

#print(hapList)

#print(max(hapList))

#print(hapList.count(3))

countList=[]
for i in range(max(hapList)+1):
    countList.append(hapList.count(i))

#print(countList)

maxValue=max(countList)
maxIndex=countList.index(maxValue)

print(maxIndex)