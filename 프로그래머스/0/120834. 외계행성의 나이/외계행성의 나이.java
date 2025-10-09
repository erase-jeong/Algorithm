class Solution {
    public String solution(int age) {
        String answer = "";
        char[] chArr={'a','b','c','d','e','f','g','h','i','j'};
        
        String str=String.valueOf(age);
        int[] ageArr=new int[str.length()];
        
        for(int i=0;i<str.length();i++){
            ageArr[i]=str.charAt(i)-'0';
            int idx=ageArr[i];
            answer+=chArr[idx];
        }
        
        return answer;
    }
}