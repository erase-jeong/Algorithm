class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            char ch=my_string.charAt(i);
            if(ch==alp.charAt(0)){
                answer+=Character.toUpperCase(ch);
                //answer+=ch.toUpperCase();
            } 
            else{
                answer+=ch;
            }
        }
        return answer;
    }
}