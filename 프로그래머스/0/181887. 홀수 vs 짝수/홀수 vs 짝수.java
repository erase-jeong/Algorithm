class Solution {
    public int solution(int[] num_list) {
        int oddSum = 0;
        int evenSum=0;
        for(int i=0;i<num_list.length;i=i+2){
            oddSum+=num_list[i];
        }
        
        for(int i=1;i<num_list.length;i+=2){
            evenSum+=num_list[i];
        }
        
        if(oddSum>evenSum){
            return oddSum;
        }
        else{
            return evenSum;
        }

    }
}