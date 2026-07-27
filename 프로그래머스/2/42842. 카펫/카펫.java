import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        for(int i=1;i*i<=yellow;i++){
            if(yellow%i==0) {
                if((yellow/i+2)*(i+2)==brown+yellow) return new int[]{yellow/i+2, i+2};
            }
        }
        
        //System.out.println(Arrays.deepToString(candi.toArray()));
        
        return answer;
    }
}

/*
yellow의 개수 : 가로(yn), 세로(ym)
browm의 개수 : 가로(bn), 세로(bm)
전체 사각형 :  bn * bm

yn+2=bn
ym+2=bm

yn*ym=yellow
bn*bm=brown+yellow
(yn+2)(ym+2) = yn*ym+2*yn+2*ym+4=

이렇게하지말고, 경우의 수 모두 다 한다음에 우리 조건에 충족하는지 유무를 통해서 파악하기



*/