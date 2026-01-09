import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        for(int i=0;i<query.length;i++){
            if(i%2==0){  //짝수 인덱스일 때
                arr=Arrays.copyOfRange(arr,0,query[i]+1);
            }else{ //홀수 인덱스일 때
                arr=Arrays.copyOfRange(arr,query[i],arr.length);
            }
        }
        return arr;
    }
}

/*
자바 배열 => 정적
배열을 짜르려면? substring? List로 변환한 후 작업하기?
*/