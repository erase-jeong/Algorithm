import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0) lst.add(arr[i]);
        }
        int[] intArr=lst.stream().mapToInt(Integer::intValue).toArray();
        
        Arrays.sort(intArr);
        
        if(intArr.length==0) return new int[]{-1};
        else return intArr;
    }
}