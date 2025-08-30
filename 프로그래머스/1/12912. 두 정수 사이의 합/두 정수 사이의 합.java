class Solution {
    public long solution(int a, int b) {
        
        //a, b 정렬하기
        if(a>b){
            int tmp=b;
            b=a;
            a=tmp;
        }
        
        
        long answer=0;
        
        for(int i=a; i<=b;i++){
            answer+=i;
        }

        return answer;
    }
}