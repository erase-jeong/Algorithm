class Solution {
    public double solution(int[] arr) {
        double sum = 0;
        for(int x:arr){
            sum+=x;
        }
        return sum/arr.length;
    }
}