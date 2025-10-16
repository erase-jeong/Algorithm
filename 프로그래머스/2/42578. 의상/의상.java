import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer=1;
        
        //HashMap 선언
        HashMap<String,List<String>> map=new HashMap<>();
        
        //값 넣기
        for(int i=0;i<clothes.length;i++){
            String name=clothes[i][0];
            String type=clothes[i][1];
            map.computeIfAbsent(type,k->new ArrayList<>()).add(name);
        }
    
        
        //결과 만들기
        
        for(String s : map.keySet()){
            answer*=map.get(s).size()+1;
        }
        
        
        return answer-1;
    }
}
