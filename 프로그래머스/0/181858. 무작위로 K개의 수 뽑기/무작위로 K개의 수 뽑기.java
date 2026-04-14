import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        //System.out.println(set);
        //int[] answer={};
        int[] answer=new int[k];
        //answer을 -1로 초기화하기
        for(int i=0;i<k;i++){
            answer[i]=-1;
        }
        
        int j=0;
        for(int val:set){
            answer[j]=val;
            j++;
            if(j>=k) break;
        }
        
        return answer;
    }
}