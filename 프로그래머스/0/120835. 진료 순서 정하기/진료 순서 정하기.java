import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer =new int[emergency.length];
        TreeMap<Integer,Integer> map=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<emergency.length;i++){
            map.put(emergency[i],i);
        }        
        int j=1;
        for(Integer key:map.keySet()){
            int idx=map.get(key);
            answer[idx]=j++;
        }
        return answer;
    }
}
/*
값이 클수록 응급도가 높다

어차피 정렬하면 기존의 순서가 흐트러진다.
그럼 기존의 인덱스 위치를 기억할 수 있는 게 필요하다.
그리고 인덱스랑 순위는 1차이여서
값 넣을때는 인덱스 +1을 넣자??

*/