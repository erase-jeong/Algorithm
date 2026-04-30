import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        //String[] arr =myStr.split("a|b|c"); //둘다 같은 의미이다
        String[] arr=myStr.split("[abc]");
        
        //String 을 이용한 빈 문자열 걸러내기
        String[] answer=Arrays.stream(arr)
            .filter(s->!s.isEmpty()) //빈 문자열이 아닌 것만 통과
            .toArray(String[]::new); //다시 String 배열로 변환
        
        //3.결과 배열이 비어있다면 ["EMPTY"]를 반환
        if(answer.length==0){
            return new String[]{"EMPTY"};
        }
        return answer;
    }
}