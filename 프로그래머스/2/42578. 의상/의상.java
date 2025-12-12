import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map=new HashMap<>();
        
        //종류별 개수 세기
        for(int i=0;i<clothes.length;i++){
            String category=clothes[i][1];
            
            if(map.containsKey(category)){
                map.put(category,map.get(category)+1);
            }else{
                map.put(category,1);
            }
        }
        
        //조합 계산
        int answer=1;
        for(int count:map.values()){
            answer*=(count+1); //입지 않는 경우 포함
        }
        
        //아무것도 안입은 경우 제외
        return answer-1;
    }
}


/*
if clothes[i][1]에 해당하는 값이 hashmap에 있는지 확인하기
    => 없으면? key 추가하기
    => 있으면? value넣기
*/
