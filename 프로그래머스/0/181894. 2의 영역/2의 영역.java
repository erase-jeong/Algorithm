import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int firstIdx=-1;
        int lastIdx=-1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                if(firstIdx==-1){
                    firstIdx=i;
                }
                lastIdx=i;
            }
        }
        
        //2가 없는 경우
        if(firstIdx==-1){
            return new int[]{-1};
        }
        
        //2의 구간만큼 배열 복사
        //Arrays.copyOfRange(원본, 시작인덱스, 끝인덱스+1)
        return Arrays.copyOfRange(arr,firstIdx, lastIdx+1);
    }
}



/*
리스트로 받기 -> 배열로 바꾸기
2가 있으면 start하고, 2가 없으면 end
리스트의 크기가 0이면, 그냥 빈걸로 출력하기
*/

/*
0 1 2 3 4 5 6
6-1+1=5
*/