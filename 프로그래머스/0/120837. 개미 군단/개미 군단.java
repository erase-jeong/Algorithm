class Solution {
    public int solution(int hp) {
        int answer = 0;
        if(hp>=5){
            answer+=hp/5;
            hp=hp%5;
        }
        
        if(hp>=3){
            answer+=hp/3;
            hp%=3;
        }
        
        if(hp>=1){
            answer+=hp/1;
            //hp%=1;
        }
        
        return answer;
    }
}


/*
전형적인 그리디 알고리즘
if(5로 나눈다)=> 나누어 떨어진다.
hp%
if(3으로 나눈다)=>나누어 떨어진다.

if(1로 나눈다 ) => 나누어 떨어진다.


*
더 적은게 좋은거다.
정당성 분석하기
6이 있따. => 병정개미(3)*2 vs 장군개미(5) + 일개미(1)  => 2마리 / 2마리
9가 있다 => 5+3+1 / 3*3
12가 있다 => 2 + 2 / 3*4
=> 그리디가 확실히 되는가? 반례가 없는가?
반례 검증법
6dl이 있
*/