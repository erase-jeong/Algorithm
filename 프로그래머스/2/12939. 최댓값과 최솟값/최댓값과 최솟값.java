import java.util.*;

class Solution {
    public String solution(String s) {        
        String[] arr=s.split(" ");
        
        int max=Integer.parseInt(arr[0]);
        int min=Integer.parseInt(arr[0]);
        
        for(int i=0;i<arr.length;i++){
            int value=Integer.parseInt(arr[i]);
            if(value>max) max=value;
            if(value<min) min=value;
        }
        
        return min+" "+max;
    }
}
/*
방법1) String -> String배열 -> Int배열

방법2) String -> String배열
  반복문 돌면서 int로 바꿔서 하기

----------
반복문 돌면서 
- max보다 크면 max로 갱신
- min보다 작으면 min로 갱신
*/