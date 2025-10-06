import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        
        //우선순위 큐 (내림차순)
        //PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        int[] answer = new int[score.length];
        
        for(int i=0;i<score.length;i++){
            if(queue.size()>=k){
                //비교 : queue.peek()  , score[i]이랑
                if(queue.peek()<score[i]){
                    queue.poll();
                    queue.offer(score[i]);
                } 
            }else{
                queue.offer(score[i]);
            }
            
            //매일 제일 우선순위 큐에 있는 값중에서 제일 작은 값 출력하기
            answer[i]=queue.peek();
            //System.out.println(queue.peek());
            
            
        }

        return answer;
    }
}

/*
우선순위 큐?
값을 넣는다. 근데 3개까지만 넣는다.
=> 3개 이상일때는, 넣을 떄 우선순위(크기 순)에 따라서 값을 넣는다.
=> 3보다 크다면 가차없이 값을 버린다. 
=> 발표 점수로 출력하는 것은 가차없이 젤 작은 값

** queue의 사이즈는 3!! 
*/
