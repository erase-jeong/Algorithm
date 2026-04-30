class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int patLength=pat.length();
        for(int i=0;i<myString.length()-pat.length()+1;i++){
            System.out.print(myString.charAt(i)+" ");
            String newString=myString.substring(i,i+pat.length());
            System.out.println(myString.substring(i,i+pat.length()));
            if(pat.equals(newString)) answer++;
            
        }
        return answer;
    }
}