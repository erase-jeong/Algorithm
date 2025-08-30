class Solution {
    public String solution(String s) {
        
        int mid=s.length()/2;
        
        if(s.length()%2==0){
            //짝수 길이 -> 가운데 2글가
            return s.substring(mid-1,mid+1);
        }
        else{
            //홀수 길이 -> 가운데 1글자
            return String.valueOf(s.charAt(mid));
        }
        
    }
}