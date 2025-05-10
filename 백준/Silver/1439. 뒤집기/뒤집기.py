data=input()

prev=int(data[0])

result=1

for i in range(1,len(data)):
    if prev!=int(data[i]):
        result+=1
        prev=int(data[i])
        
print(result//2)