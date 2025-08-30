import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int ans=0;
        Arrays.sort(A);
        Arrays.sort(B);
        //Arrays.sort(B, Collections.reverseOrder()); //내림차순
        
        for(int i=0;i<A.length;i++){
            ans+=A[i]*B[B.length-1-i];  //B의 큰 값부터 곱하기
        }
        
        return ans;
    }
}