class Solution {
    public int solution(int n) {
        int answer = 1;
        long fact=1;  
        while(true){
            if(fact>n){
                answer--;
                break;
            }
            answer++;
            fact*=answer;      
        }
        return answer;
    }
}
/*
n을 1, 2, 3,4 씩 하나씩 커지면서 나누고
그 나눈 값을 따로 저장한다.
n=n/1
n=n/2
n=n/3
n=n/4

1!=1 <36~~
2!=2<36~
3!=6<36~
4!=24<36~
5!=120<36~
6!=720<36~

*/