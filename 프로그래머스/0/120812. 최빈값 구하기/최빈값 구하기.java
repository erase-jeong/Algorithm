import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int key:array){
            map.put(key,map.getOrDefault(key,0)+1);
        }
        //System.out.println("map : "+map);
        
        int max_cnt=Integer.MIN_VALUE;
        //순회
        for(Integer key:map.keySet()){
            if(map.get(key)>=max_cnt) max_cnt=map.get(key); //등호를 붙여야 하는 이유?
            //System.out.println(key+" : "+map.get(key));
        }
        //System.out.println("max_cnt : "+max_cnt);
        
        
        int cnt=0;
        int value=0;
        for(Integer key:map.keySet()){
            if(max_cnt==map.get(key)){
                cnt+=1;
                value=key;
            }
        }
        
        if(cnt==1){
            return value;
        }else{
            return -1;
        }

    }
}