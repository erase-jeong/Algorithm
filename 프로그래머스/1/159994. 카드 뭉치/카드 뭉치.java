import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = 0;  // cards1의 현재 위치 인덱스
        int index2 = 0;  // cards2의 현재 위치 인덱스

        // goal 배열을 순서대로 확인합니다.
        for (String word : goal) {
            // 현재 단어를 cards1에서 사용할 수 있는 경우
            if (index1 < cards1.length && cards1[index1].equals(word)) {
                index1++;  // 다음 위치로 이동
            }
            // 현재 단어를 cards2에서 사용할 수 있는 경우
            else if (index2 < cards2.length && cards2[index2].equals(word)) {
                index2++;  // 다음 위치로 이동
            }
            // 둘 다 해당되지 않으면 goal을 만들 수 없습니다.
            else {
                return "No";
            }
        }
        
        // 모든 단어를 사용할 수 있으면 "Yes" 반환
        return "Yes";
    }
}
        
