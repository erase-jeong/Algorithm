class Solution {
    public long solution(int n) {
        long[] dp=new long[n+1];
        dp[1]=1; //1은 1로만 표현가능하다
        if(n>1) dp[2]=2; //2는 2가지 방법으로 표현 가능하다. 1+1 / 2 
        
        for(int i=3;i<=n;i++){
            dp[i]=(dp[i-1]+dp[i-2])%1234567;
        }
        
        return dp[n];
    }
}