import java.util.*; 

class Solution {
    public int solution(int[] food_times, long k) {
        PriorityQueue<int[]> heap=new PriorityQueue<>((a,b)->a[0]-b[0]);
        
        for(int i=0;i<food_times.length;i++){
            heap.offer(new int[]{food_times[i],i+1}); //{시간, 음식번호}
        }
        
        long prev=0;
        long remaining=food_times.length;
        
        while(!heap.isEmpty()){
            int[] cur=heap.peek();
            long cost=(cur[0]-prev)*remaining; //이번 층 소비시간
            
            if(k<cost) break; //이 층 안에 정답 있음
            k-=cost;
            prev=cur[0];
            heap.poll();
            remaining--;
        }
        
        if(heap.isEmpty()) return -1;
        
        //남은 음식을 번호 순으로 정렬
        ArrayList<int[]> left=new ArrayList<>(heap);
        left.sort((a,b)->Long.compare(a[1],b[1])); //음식번호 기준
        
        return (int)left.get((int)(k%remaining))[1];
    }
}
