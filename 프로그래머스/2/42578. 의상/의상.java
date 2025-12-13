import java.util.*;

class Solution{
    public int solution(String[][] clothes){
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<clothes.length;i++){
            String category=clothes[i][1];
            
            if(!map.containsKey(category)){
                map.put(category,1);
            }else{
                map.put(category,map.get(category)+1);
            }
        }
        
        int answer=1;
        for(String key :map.keySet()){
            answer*=(map.get(key)+1);
        }    
        return answer-1;
    }
}