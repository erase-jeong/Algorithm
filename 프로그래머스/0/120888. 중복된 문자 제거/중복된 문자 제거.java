import java.util.*;

class Solution {
    public String solution(String my_string) {
                StringBuilder sb=new StringBuilder();
        Set<Character> set=new HashSet<>();

        for(int i=0;i<my_string.length();i++){
            char c=my_string.charAt(i); //char로 꺼내오기
            if(set.add(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}