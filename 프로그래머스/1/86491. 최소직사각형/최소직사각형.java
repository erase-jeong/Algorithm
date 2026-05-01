import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        List<Integer> big=new ArrayList<>();
        List<Integer> small=new ArrayList<>();
        
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0]>sizes[i][1]){
                big.add(sizes[i][0]);
                small.add(sizes[i][1]);
            }else{
                big.add(sizes[i][1]);
                small.add(sizes[i][0]);
            }
        }
        
        int a=Collections.max(big);
        int b=Collections.max(small);
        
        return a*b;
    }
}