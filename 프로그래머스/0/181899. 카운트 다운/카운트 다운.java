class Solution{
    public int[] solution(int start,int end_num){
        //배열의 크기를 계산하여 초기화
        int size=start-end_num+1;
        int[] answer=new int[size];
        
        //배열에 값을 채우기
        for(int i=0;i<size;i++){
            answer[i]=start-i;
        }
        
        return answer;
    }
}