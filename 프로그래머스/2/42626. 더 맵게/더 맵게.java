import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int cnt=0;
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for(int s:scoville){
            queue.add(s);
        }
        
        while(queue.peek()<K){
            if(queue.size()==1) return -1;
            
            //음식 섞기
            queue.add(queue.poll()+(queue.poll()*2));
            cnt++;
        }
        
        return cnt;
    }
}