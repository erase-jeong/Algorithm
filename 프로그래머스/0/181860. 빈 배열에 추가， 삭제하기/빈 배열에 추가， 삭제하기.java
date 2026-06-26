import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> lst=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(flag[i]==true){
                int n=arr[i]*2;
                for(int j=0;j<n;j++){
                    lst.add(arr[i]);
                }
            }
            else{
                for(int j=0;j<arr[i];j++){
                    lst.remove(lst.size()-1);
                }
            }
        }
        
        //1.리스트 크기만큼 배열 생성
        int[] answer=new int[lst.size()];
        
        //2.반복문으로 값 복사
        for(int i=0;i<lst.size();i++){
            answer[i]=lst.get(i);
        }
        
        return answer;
    }
}

/*
arr , flag

1. flag를 차례대로 순회한다.
   - if(flag[i]==true){
       - arr[i]*2번 추가
     else 
       - 마지막 arr[i]개의 원소 제거 -> x return 

*/