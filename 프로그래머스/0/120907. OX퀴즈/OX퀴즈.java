import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        //1.퀴즈 개수만큼 결과를 담을 배열 공간 확보
        String[] answer=new String[quiz.length];
        
        for(int i=0;i<quiz.length;i++){
            //2.공백을 기준으로 쪼개기
            String[] arr=quiz[i].split(" ");
            
            //3.문자열을 숫자로 변환
            int x=Integer.parseInt(arr[0]);
            String oper=arr[1];
            int y=Integer.parseInt(arr[2]);
            int z=Integer.parseInt(arr[4]);
            
            //4.연산자에 따른 계산 및 비교
            int result=0;
            if(oper.equals("+")) result=x+y;
            else result=x-y;
            
            //5. 결과에 따라 0 또는 X저장
            if(result==z) answer[i]="O";
            else answer[i]="X";
        }
        return answer;
    }
}