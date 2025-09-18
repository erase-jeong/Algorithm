import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        //한 번에 칠할 수 있는 페인트 영역
        
        int end=section[0]+m-1;
        
        for(int point:section){
            //point가 한 번에 칠할 수 있는 영역보다 크면
            if(point>end){
                //한 번 더 칠하기
                answer++;
                //한 번에 칠할 수 있는 영역 갱신
                end=point+m-1;
            }
        }

        
        return answer;
    }
}