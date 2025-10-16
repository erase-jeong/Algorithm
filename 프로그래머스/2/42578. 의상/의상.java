import java.util.*;


import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer=1;
        HashMap<String, List<String>> map=new HashMap<>();
        
        for(int i=0;i<clothes.length;i++){
            if(!map.containsKey(clothes[i][1])){
                List<String> lst=new ArrayList<>();
                lst.add(clothes[i][0]);
                map.put(clothes[i][1],lst);
            }else{
                List<String> lst=new ArrayList<>();
                lst=map.get(clothes[i][1]);
                lst.add(clothes[i][0]);
                map.put(clothes[i][1],lst);
            }
        }
        
        for(String s : map.keySet()){
            List<String> lst2=new ArrayList<>();
            lst2=map.get(s);
            int size=lst2.size();
            answer*=size+1;            
        }
        
        answer-=1;
        return answer;
    }
}

/*
*해시맵 이용
<key, value> set = {};
key에 두번째 값 넣고 없으면 추가하고
headgear : {yellow_hat, green_turban},
eyewear : {blue_sunglasses}

해시맵? 해시셋? 셋은 그냥 셋일텐데?
*/