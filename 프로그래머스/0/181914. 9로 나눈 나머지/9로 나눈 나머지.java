class Solution {
    public int solution(String number) {
        char[] arr=number.toCharArray();
        
        int sum=0;
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]-'0';
        }
        
        int answer=sum%9;
        
        return answer;
    }
}