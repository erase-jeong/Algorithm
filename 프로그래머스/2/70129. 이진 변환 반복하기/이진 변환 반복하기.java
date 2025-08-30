class Solution {
    public int[] solution(String s) {
        
        int[] answer ={0,0};
        
        while(!s.equals("1")){
            String s2="";
            //s의 모든 0을 제거한다.
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1') s2+=s.charAt(i);
            }
            
            //제거된 0의 개수
            answer[1]+=(s.length()-s2.length());
            
            //c<-- 0제거 후 x의 길이
            int c=s2.length();
            s=Integer.toString(c,2);
            
            //s<-- c를 이진 변화한 결과
            //이진수 변환로직 -> 2로 나눈다? 6/2=3 --
            
            answer[0]+=1;
        }
        
        //answer[0]=변환횟수;
        //answer[1]=제거된 0의 개수;
        return answer;
    }
}