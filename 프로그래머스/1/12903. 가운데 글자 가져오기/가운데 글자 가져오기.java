class Solution{
    public String solution(String s){
        String answer="";
        int n=s.length();
        int mid=n/2;
        
        if(n%2==0){ //짝수
            answer+=s.substring(mid-1,mid+1);
        }else{ //홀수
            answer+=s.substring(mid,mid+1);
        }
        return answer;
    }
}
