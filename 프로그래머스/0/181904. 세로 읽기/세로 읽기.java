class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int idx=c-1;
        
        while(my_string.length()>idx){
            answer+=my_string.charAt(idx);
            idx+=m;
        }
        
        return answer;
    }
}


