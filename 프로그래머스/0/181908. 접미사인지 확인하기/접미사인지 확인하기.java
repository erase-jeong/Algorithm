import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        
        int answer=0;
        
        //1 접미사 배열 만들기
        String[] mm=new String[my_string.length()];
        
        for(int i=0;i<mm.length;i++){
            mm[i]=my_string.substring(i);
        }
        
        // 2 접미사인지 확인하기
        for(int i=0;i<mm.length;i++){
            if(is_suffix.equals(mm[i])){
                answer=1;
                break;    
            } 
        }
        
        return answer;
    }
}