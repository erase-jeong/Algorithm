//정답 코드
import java.util.*;

class Solution{
    public int solution(int n, int[] lost, int[] reserve){
        int[] clothes=new int[n+2]; //인덱스 1~n을 사용하기 위해 n+2
        
        //1.초기 상태 설정(기본적으로 1벌씩 있음)
        for(int i=1;i<=n;i++){
            clothes[i]=1;
        }
        
        //2.도난당한 학생은 -1
        for(int i:lost){
            clothes[i]--;
        }
        
        //3.여벌이 있는 학생은 +1
        for(int i:reserve){
            clothes[i]++;
        }
        
        //4.빌려주기 로직(그리디)
        for(int i=1;i<=n;i++){
            if(clothes[i]==0){ //체육복이 없는 경우
                if(clothes[i-1]==2){ //앞 번호 학생에게 빌리기
                    clothes[i-1]--;
                    clothes[i]++;
                }else if(clothes[i+1]==2){ //뒷 번호 학생에게 빌리기  
                    clothes[i+1]--;
                    clothes[i]++;
                }
            }
        }
        
        //5.1벌 이상 있는 학생 수 세기
        int answer=0;
        for(int i=1;i<=n;i++){
            if(clothes[i]>=1){
                answer++;
            }
        }
        return answer;
    }
}