n=int(input())

li=[]
for i in str(n):
    li.append(int(i))
 
li.sort(reverse=True) #내림차순 정렬

for i in li:
    print(i,end='')