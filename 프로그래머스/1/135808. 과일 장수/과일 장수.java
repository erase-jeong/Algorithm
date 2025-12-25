import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int s : score){
            pq.offer(s);
        }
        
        int totalProfit=0;
        
        while(pq.size()>=m){
            int min=Integer.MAX_VALUE;
            
            for(int i=0;i<m;i++){
                int value=pq.poll();
                min=Math.min(value,min);
            }
            
            totalProfit+=min*m;
        }
        
        return totalProfit;
        
    }
}


/*
1. 우선순위 큐 만들기 (내림차순)

totalProfit=0;

2. while(큐에 m개 이상이라면){
    min값 초기화&갱신
    for(m번 반복){
        int value=꺼내기
        min=Math.min(value,min);
    }
    profit+=min*m;
}
*/