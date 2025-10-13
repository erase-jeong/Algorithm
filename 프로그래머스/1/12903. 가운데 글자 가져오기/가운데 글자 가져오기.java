class Solution{
    public String solution(String s){
        String answer="";
        int mid=s.length()/2;
        
        if(s.length()%2==1){
            answer=s.substring(mid,mid+1);
        }
        else{  //짝수
            answer=s.substring(mid-1,mid+1);
        }
        
        return answer;   
    }
}

/*
홀수
0 1 2 3 4 
mid=길이/2 =>2 , 2번인덱스 ok

짝수
0 1 2 3 4 5
mid=3번 + -1번인덱스
mid-1 ~ mid 
*/