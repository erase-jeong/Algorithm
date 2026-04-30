import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        //학생 번호와 등수를 하나로 묶기 (학생번호, 등수)
        TreeMap<Integer,Integer> map=new TreeMap<>();
        
        for(int i=0;i<rank.length;i++){
            if(attendance[i]) map.put(rank[i],i);
        }
    
        //가장 앞에 있는 3개만 꺼내기
        int a=map.pollFirstEntry().getValue();
        int b=map.pollFirstEntry().getValue();
        int c=map.pollFirstEntry().getValue();
        
        int answer=10000*a+100*b+c;        
        return answer;
    }
}
