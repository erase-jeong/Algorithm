import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int temp=9999; //최소차이 저장
        
        Arrays.sort(array); //배열 오름차순으로 정렬
        //차이가 같은 경우 '더 작은 수' 선택
        
        for(int i=0;i<array.length;i++){
            int diff=Math.abs(array[i]-n);
            if(temp>diff){
                temp=diff; //최소차이 갱신
                answer=array[i]; //답을 array[i]로 갱신
            }
        }
        return answer;
    }
}