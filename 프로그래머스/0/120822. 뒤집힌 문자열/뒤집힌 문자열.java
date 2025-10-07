class Solution {
    public String solution(String my_string) {
        String answer="";
        
        char[] arr=my_string.toCharArray();
        for(int i=0;i<arr.length;i++){
            answer+=arr[arr.length-i-1];
        }
        
        return answer;
    }
}