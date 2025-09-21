import java.util.*;

class Solution {
    public String solution(String my_string) {
        
        my_string=my_string.toLowerCase();
        System.out.println(my_string);
        
        //string -> array
        char[] arr=my_string.toCharArray();
        
        //array에서 정렬
        Arrays.sort(arr);
        
        //array -> string
        //String answer=Arrays.toString(arr);  //단순 출력용
         
        return new String(arr);
    }
}