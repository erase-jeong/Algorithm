import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int n = topping.length;
        
        // 1. 오른쪽(전체) 카운트 배열 준비
        int[] rightCount = new int[10001];
        for (int t : topping) rightCount[t]++;
        
        int rightDistinct = 0;
        for (int c : rightCount) if (c > 0) rightDistinct++;
        
        // 2. 왼쪽은 처음엔 비어있음
        Set<Integer> leftSet = new HashSet<>(); // 또는 boolean[10001]
        
        for (int i = 0; i < n - 1; i++) { // 마지막 원소는 자르면 오른쪽이 비니 제외
            int t = topping[i];
            
            // 왼쪽에 추가
            if (leftSet.add(t)) {
                // 새로 추가된 경우만 true 반환됨 (HashSet 특성)
            }
            
            // 오른쪽에서 제거
            rightCount[t]--;
            if (rightCount[t] == 0) rightDistinct--;
            
            if (leftSet.size() == rightDistinct) answer++;
        }
        
        return answer;
    }
}