import java.util.*;

class Solution {
    public int solution(int num, int k) {
        int answer=-1; //초기값을 -1로 설정
        String str=Integer.toString(num);
        //String str=String.valueOf(num);
        String[] arr=str.split("");
        
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(String.valueOf(k))){
                answer=i+1; //정답을 찾았을 때 answer값을 업데이트하고 루프를 빠져나감
                break;
            }
        }
        return answer;
    }
}