import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] strArr=myString.split("x");
        
        ArrayList<String> al=new ArrayList<>();
        
        for(String str:strArr){
            if(!str.isEmpty()){
                al.add(str);
            }
        }
        
        String[] result=new String[al.size()];
        al.toArray(result);  //리스트의 요소들을 배열에 복사한다.
        Arrays.sort(result);
        
        return result;
    }
}
