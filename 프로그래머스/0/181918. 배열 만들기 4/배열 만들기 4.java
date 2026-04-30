import java.util.*;

class Solution {
    public int[] solution(int[] arr){
        List<Integer> stk=new ArrayList<>();
        int i=0;
        
        while(i<arr.length){
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i++;
            }else{
                int lastIdx=stk.size()-1;
                if(stk.get(lastIdx)<arr[i]){
                    stk.add(arr[i]);
                    i++;
                }else{
                    //마지막 원소가 arr[i]보다 크거나 같으면 제거
                    //i를 증가시키지 않으므로 다음 루프에서 같은 arr[i]로 다시 비교함
                    stk.remove(lastIdx);
                }
            }
        }
        
        //List를 배열로 변환
        int[] answer=new int[stk.size()];
        for(int j=0;j<stk.size();j++){
            answer[j]=stk.get(j);
        }
        return answer;
    }
}



//////////////////

/*
stk가 빈 배열 => arr[i]를 stk에 추가, i+1
stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 
*/


