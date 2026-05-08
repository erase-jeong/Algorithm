import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        //우선순위 큐 선언(내림 차순)
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        int answer=0;
        
        //우선순위 큐에 우선순위 요소 추가
        for(int i : priorities){
            q.offer(i);
        }
        System.out.println(q);
        
        //큐가 빌때까지 반복
        while(!q.isEmpty()){
            //System.out.println(q.poll());
            //기존 우선순위 배열 순회
            for(int i=0;i<priorities.length;i++){
                //현재 작업의 위치 찾기
                if(q.peek()==priorities[i]){
                    q.poll();
                    answer++;
                    
                    //현재 작업이 location과 같으면 answer 반환
                    if(location==i) return answer;
                }
            }
        }
        
        return answer;
    }
}