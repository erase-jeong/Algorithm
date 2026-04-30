class Solution {
    public int[] solution(int num, int total) {
        int[] answer =new int[num];
        //a = total-(1~num-1까지 합) / num
        
        int sub=0;
        for(int i=1;i<num;i++){
            sub+=i;
        }
        int startV=(total-sub)/num;
        
        for(int i=0;i<num;i++){
            answer[i]=startV;
            startV++;
        }
    
        return answer;
    }
}

/*
홀수개 / 짤수
홀수개 / 홀수
짝수개 / 짝수
짝수개 / 홀수  =1+1+1+2 / 2+2+2+2


a+a+1+a+2=total     ---> a가 무엇인지 찾기
a+a+1+a+2+a+3=total --->

num=3, total=12
a+a+1+a+2=12
3a+3=12
3a=9
a=3
-----------------
num=5, total=15
a+a+1+a+2+a+3+a+4=15
5a+(1+2+3+4)=15
5a+10=15
5a=5
a=1

a = total-(1~num-1까지 합) / num
*/