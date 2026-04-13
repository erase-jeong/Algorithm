import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int n=numbers.length;
        int[] answer = new int[n];
        if(direction.equals("right")){
            for(int i=0;i<n;i++){
                answer[i]=numbers[(i+n-1)%n];
            }
           
        }else if(direction.equals("left")){
            for(int i=0;i<n;i++){
                answer[i]=numbers[(i+1)%n];
            } 
        }
        return answer;
    }
}