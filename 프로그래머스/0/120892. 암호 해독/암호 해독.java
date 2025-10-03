class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i=code-1;i<cipher.length();i+=code){
            //System.out.print(cipher.charAt(i));
            answer+=cipher.charAt(i);
        }
        return answer;
    }
}