
class Solution {
    public int solution(int n) {
        //n의 이진수 표현에서의 1의 개수를 찾는 변수
        int count=Integer.bitCount(n);
        
        //n보다 큰 다음 정수부터 시작
        int answer=n+1;
        
        while(true){
            //1의 개수가 같아지면 반복문 종료
            if(count==Integer.bitCount(answer)){
                break;
            }
            answer++;
        }
        return answer;
    }
}