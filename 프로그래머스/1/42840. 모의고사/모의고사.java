import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] one={1,2,3,4,5};  //5
        int[] two={2,1,2,3,2,4,2,5}; //8
        int[] three={3,3,1,1,2,2,4,4,5,5}; //10
        
        int one_cnt=0;
        int two_cnt=0;
        int three_cnt=0;
        
        //1.점수 게산
        for(int i=0;i<answers.length;i++){
            if(answers[i]==one[i%5]) one_cnt++; //1번학생
            if(answers[i]==two[i%8]) two_cnt++; //2번학생 
            if(answers[i]==three[i%10]) three_cnt++; //3번학생
        }
        
        //2.최댓값 찾기
        //세 점수 중 가장 큰 값을 구한다.
        int maxScore=Math.max(one_cnt, Math.max(two_cnt,three_cnt));
        
        //3.가장 높은 점수를 받은 사람 찾기
        //문제 조건에서 결과는 오름차순이어야 하므로 1번학생부터 차례대로 확인한다.
        List<Integer> winners=new ArrayList<>();
        if(one_cnt==maxScore) winners.add(1);
        if(two_cnt==maxScore) winners.add(2);
        if(three_cnt==maxScore) winners.add(3);
        
        //4.List를 int[] 배열로 변환
        //스트림을 사용하면 한 줄로 변환이 가능하다
        return winners.stream().mapToInt(Integer::intValue).toArray();
    }
}
