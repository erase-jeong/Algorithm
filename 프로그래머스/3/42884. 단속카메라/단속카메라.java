import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes,(a,b)->{
            if(a[1]==b[1]) return a[0]-b[0];
           return a[1]-b[1]; 
        });
        
        int count=0;
        int lastStart=-300001;
        int lastEnd=-300001;
        
        for(int[] r:routes){
            int start=r[0];
            int end=r[1];
            
            if(start<=lastEnd){
                lastStart=start;
            }else{
                count++;
                lastStart=start;
                lastEnd=end;
            }
        }
        return count;
    }
}