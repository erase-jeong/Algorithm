import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer="";
        HashMap<String,Integer> map=new HashMap<>();
        
        for(String p:participant){
            if(!map.containsKey(p)) map.put(p,1); //key가 없으면 0을 넣어라
            else map.put(p,map.get(p)+1); //key가 있으면 +1한 값을 넣어라            
        }
        for(String c:completion){
            map.put(c,map.get(c)-1); //완주한 사람은 -1
        }
        
        for(String key:map.keySet()){
            if(map.get(key)==1) answer=key; //남은 사람이 미완주자
        }
        
        return answer;
    }
}


