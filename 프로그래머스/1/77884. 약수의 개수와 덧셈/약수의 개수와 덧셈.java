class Solution {
    public int solution(int left, int right) {
        int oddsum=0;
        int evensum=0;
        int answer=0;
        
        for(int i=left;i<=right;i++){
            //약수 개수 구하기 (1과 자기자신은 빼고)
            int cnt=0;
            for(int j=2;j<i/2;i++){
                if(i%j==0) cnt+=1;
            }
            if(cnt%2==0){
                answer+=i;
            }
                answer-=i;
        }
        
        return answer;
    }
}