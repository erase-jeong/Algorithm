import java.util.*;

class Solution {
    public int solution(String s) {
        
        String[] english_word={"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0;i<english_word.length;i++){
            if(s.contains(english_word[i])){
                s=s.replace(english_word[i],String.valueOf(i));
            }
        }
        
        //System.out.print("s : "+s);
  
        int answer = Integer.parseInt(s);
        return answer;
    }
}