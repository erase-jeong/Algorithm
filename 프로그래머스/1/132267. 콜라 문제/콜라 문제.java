class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        //1. 이번에 교환할 수 있는 횟수=n/a
        //2. 받는 콜라 수=(n/a)*b
        //3. 남은 빈 병=(n%a)+받은 콜라 수
        while(n>=a){
            int received=(n/a)*b; //받은 콜라 수
            answer+=received;
            n=(n%a)+received;   
        }   
        return answer;
    }
}