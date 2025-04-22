N,M,L=map(int,input().split())
balls=[0]*N
count,now=0,0

#while(max(balls)!=M):
while(max(balls)<M):
    #print("공 위치 : ",{now+1})  -> 이거 있으면 출력초과
    
    if balls[now]%2==0:  # 실제론 홀수 (0번 인덱스부터여서)
        balls[now]+=1
        now=(now+L)%N
        count+=1
        
    else: #실제론 짝수 (0번 인덱스부터여서)
        balls[now]+=1
        now=(now-L)%N  
        count+=1

print(count-1)