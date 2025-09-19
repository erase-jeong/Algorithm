import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int pick_num=nums.length/2;
        
        Set<Integer> hs=new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        
        //진짜 찐 개수 확인
        int real_num=0;
        
        real_num=hs.size();
        
        //확인용 출력
        if(real_num>pick_num){
            return pick_num;
        }else{
            return real_num;
        }
    }
}