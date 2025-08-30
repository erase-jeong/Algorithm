import java.util.*;

class Solution {
    public String solution(String s) {
        
        String[] parts=s.split(" "); //공백 기준으로 문자열 나누기
        //System.out.println(parts);
        
        int[] nums=new int[parts.length];
        for(int i=0;i<parts.length;i++){
            nums[i]=Integer.parseInt(parts[i]); //문자열 -> 정수 변환
        }
        System.out.println(Arrays.toString(nums));
        
        Arrays.sort(nums);
        
        String ans=nums[0]+" "+nums[nums.length-1];
        
        return ans;
    }
}