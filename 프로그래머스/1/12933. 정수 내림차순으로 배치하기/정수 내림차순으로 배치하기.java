import java.util.*;

class Solution {
    public long solution(long n) {
        String nn=String.valueOf(n);
        System.out.println(nn);
        
        String[] arr=nn.split("");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,Collections.reverseOrder());
        StringBuilder sb=new StringBuilder();
        for(String s:arr){
            sb.append(s);
        }
        
        long answer=Long.parseLong(sb.toString());
        
        return answer;
    }
}

/*
정수 -> 각 자리수를 쪼개서 list나 array에 넣기 
=> list랑 array중에서 뭐가 더 효율적일까?
=> list로 선택
=> 이걸 정렬하기
*/
