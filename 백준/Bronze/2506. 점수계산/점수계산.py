N=int(input())
gradings=list(map(int,input().split()))
scores=[0]*N
for i in range(N):
    if(i==0):
        if(gradings[i]==1):
            scores[i]+=1
    else:
        if(gradings[i]==1):
            scores[i]+=1
            if(gradings[i-1]>=1):
                scores[i]+=scores[i-1]

total_score=sum(scores)
print(total_score)
