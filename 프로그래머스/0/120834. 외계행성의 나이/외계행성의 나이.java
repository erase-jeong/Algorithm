class Solution {
    public String solution(int age) {
        String answer = "";
        
        String str=String.valueOf(age);
        char[] arr=str.toCharArray();
        
        for(char c:arr){
            char ch=(char)(c+'1');
            answer+=ch;
        }
        
        
        
        return answer;
    }
}