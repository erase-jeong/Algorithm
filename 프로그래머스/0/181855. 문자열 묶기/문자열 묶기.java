import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer=0;
        
        int[] length=new int[31];
        
        for(int i=0;i<strArr.length;i++){
            int value=strArr[i].length();
            length[value]++;
        }   
        
        int maxV=0;
        for(int i=1;i<=30;i++){
            if(maxV<length[i]) maxV=length[i];
        }
        return maxV;
    }
}