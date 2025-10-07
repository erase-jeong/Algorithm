import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        PriorityQueue<Character> pq = new PriorityQueue<>();
        
        for(int i=0;i<arr.length;i++){
            map.computeIfAbsent(arr[i],k->0);
            map.put(arr[i],map.get(arr[i])+1);
        }
        
        for(Character c:map.keySet()){
            if(map.get(c)==1){
                pq.add(c);
            }
        }
        
        while(!pq.isEmpty()){
            answer+=pq.poll();
        }
        return answer;
    }
}

//System.out.println(arr);
//System.out.println(map);
//System.out.println(pq);