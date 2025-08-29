class Solution {
    public int solution(int n) {
        int answer = 0;
        String str=Integer.toString(n);
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            int num=c-'0';
            answer+=num;
        }
        return answer;
    }
}