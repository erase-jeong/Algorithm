class Solution {
    public int solution(int[] box, int n) {
        int a1=box[0]/n;
        int a2=box[1]/n;
        int a3=box[2]/n;
        
        return a1*a2*a3;
    }
}