import java.util.*;

//방법 1 : ArrayList로
/*
class Solution {
    public String[] solution(String[] strArr) {
        
        ArrayList<String> arrayList=new ArrayList<>();
        
        for(String str:strArr){
            if(!str.contains("ad")){
                arrayList.add(str);
            }
        }
        
        int idx=0;
        String[] answer=new String[arrayList.size()];
        for(String str:arrayList){
            answer[idx++]=str;
        }
        return answer;
    }
}
*/

//방법 2: 간단하게 array로 만들기
class Solution{
    public String[] solution(String[] strArr){
        ArrayList<String> al=new ArrayList<>();
        
        for(String s:strArr){
            if(!s.contains("ad")){
                al.add(s);
            }
        }
        
        return al.toArray(String[]::new);
    }
}