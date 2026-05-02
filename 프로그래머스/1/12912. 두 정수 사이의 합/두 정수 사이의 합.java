class Solution {
    public long solution(int a, int b) {
        long answer=0;
        
        int min=0, max=0;
        //a,b정렬하기
        if(a>b){
            max=a; min=b;
        }else{
            max=b; min=a;
        }
        
        //a~b까지의 수 더하기
        for(int i=min;i<=max;i++){
            answer+=i;
        }
        
        return answer;
    }
}