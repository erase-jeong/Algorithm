N=int(input())
dp=[0]*(N+1)
# dp[0] 은 사용안함
dp[1]=0 #1은 1이 되는데 0번

#dp[i] : 1가 되는데 드는 최소 연산 횟수
for i in range(2,N +1):
    #dp[i]=min(dp[i-1]+1,dp[i//2]+1,dp[i//3]+1)

    dp[i]=dp[i-1]+1
    if i%2==0:
        dp[i]=min(dp[i],dp[i//2]+1)
    if i%3==0:
        dp[i]=min(dp[i],dp[i//3]+1)

ans=dp[N]
print(ans)