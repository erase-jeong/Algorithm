A,B=map(int,input().split())

num_list=[]
cnt=0
i=0

while(cnt<=B):
    i+=1
    for _ in range(i):
        num_list.append(i)
        cnt+=1

sum=0

for i in range(A-1,B):
    sum+=num_list[i]

print(sum)