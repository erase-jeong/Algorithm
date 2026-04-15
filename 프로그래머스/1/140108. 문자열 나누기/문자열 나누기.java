class Solution {
    public int solution(String s) {
        int answer=0; //최종적으로 분리된 문자열의 개수
        int same=0; //대장 글자와 같은 글자가 나온 횟수
        int diff=0; ///대장 글자와 다른 글자가 나온 
        int first=s.charAt(0); //현재 덩어리의 첫 글자(대장 x)를 저장
        
        for(int i=0;i<s.length();i++){
            //1.새로운 덩어리를 시작해야 하는 경우 (카운트가 리셋된 상태)
            if(same==0 && diff==0){
                first=s.charAt(i);
            }
            
            //2.글자 비교하며 카운트 올리기
            if(s.charAt(i)==first){
                same++;
            }else{
                diff++;
            }
            //3.횟수가 같아지는 순간 싹둑 자르기
            if(same==diff){
                answer++;
                same=0;
                diff=0;
            }
        }
        
        //4.반복문이 끝났는데 찌꺼기가 남은 경우 처리
        if(same>0 || diff>0){
            answer++;
        }
        
        return answer;
    }
}