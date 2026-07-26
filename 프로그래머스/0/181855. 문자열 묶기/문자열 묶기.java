import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        //배열 만들기
        int[] size=new int[31];
        
        for(int i=0;i<strArr.length;i++){
            int n=strArr[i].length();
            size[n]++;
        }
        
        Arrays.sort(size);
        
        return size[30];
    }
}