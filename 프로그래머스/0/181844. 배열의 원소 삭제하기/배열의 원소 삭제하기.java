import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        ArrayList<Integer> lst=new ArrayList<>();
        
        for(int x:arr){
            lst.add(x);
        }
        
        
        for(int a : arr){
            for(int dl : delete_list){
                if(a==dl){
                    //리스트에서 해당 a값을 뺀다
                    lst.remove(Integer.valueOf(a));
                } 
            }
        }
        
        //System.out.println(lst);
        
        int[] answer=new int[lst.size()];
        int idx=0;
        for(int l:lst){
            answer[idx]=l;
            idx++;
        }
        

        return answer;
    }
}

/*
1. (가변)리스트 생성
2. delete_list에 없는 값 리스트에 넣기
3. 리스트 원소만큼 int배열 생성
4. int배열에 값 넣기
*/