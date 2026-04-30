import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int count=0;
        
        while(true){
            //1.현재 상태 복사(비교용)
            int[] prevArr=arr.clone();
            
            //2.규칙에 따라 배열 변환
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=50 && arr[i]%2==0){
                    arr[i]/=2;
                }else if(arr[i]<50 && arr[i]%2==1){
                    arr[i]=arr[i]*2+1;
                }
            }
            
            //3.이전 배열과 현재 배열이 같은지 확인
            if(Arrays.equals(prevArr,arr)){
                break; //같으면 탈출
            }
            
            //4. 다르면 횟수 추가
            count++;
        }
        return count;
    }
}

/*
arr이 바뀌지 않을 떄까지 반복하기
그리고 같은 값 찾기
*/