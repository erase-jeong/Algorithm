import java.util.*;

class Solution {
    public String solution(int n, int k, String[] cmd) {
        // 1. 링크드 리스트를 시뮬레이션할 prev, next 배열 선언
        int[] prev = new int[n];
        int[] next = new int[n];
        
        // prev와 next 배열 초기화
        for (int i = 0; i < n; i++) {
            prev[i] = i - 1;
            next[i] = i + 1;
        }
        next[n - 1] = -1; // 마지막 행의 다음은 없으므로 -1
        
        // 2. 삭제된 행의 인덱스를 저장할 스택
        Stack<Integer> deleted = new Stack<>();
        
        // 3. 명령어 순회 및 처리
        for (int i = 0; i < cmd.length; i++) {
            char command = cmd[i].charAt(0); // split 대신 첫 글자만 따오면 더 빠릅니다.
            
            if (command == 'U') {
                int x = Integer.parseInt(cmd[i].substring(2));
                for (int j = 0; j < x; j++) {
                    k = prev[k];
                }
            } 
            else if (command == 'D') {
                int x = Integer.parseInt(cmd[i].substring(2));
                for (int j = 0; j < x; j++) {
                    k = next[k];
                }
            } 
            else if (command == 'C') {
                // 현재 행(k)을 삭제 스택에 저장
                deleted.push(k);
                
                int p = prev[k]; // k의 이전 행 번호
                int nxt = next[k]; // k의 다음 행 번호
                
                // k의 이전 행이 존재한다면, 그 행의 다음을 nxt로 연결
                if (p != -1) {
                    next[p] = nxt;
                }
                // k의 다음 행이 존재한다면, 그 행의 이전을 p로 연결
                if (nxt != -1) {
                    prev[nxt] = p;
                }
                
                // 삭제 후 현재 선택된 행(k)의 이동
                // 다음 행이 존재하면 다음 행 선택, 마지막 행이었다면 이전 행 선택
                if (nxt != -1) {
                    k = nxt;
                } else {
                    k = p;
                }
            } 
            else if (command == 'Z') {
                // 가장 최근에 삭제된 행을 꺼냄
                int restore = deleted.pop();
                
                int p = prev[restore];
                int nxt = next[restore];
                
                // 원래의 이전 행이 존재한다면, 그 행의 다음을 다시 restore로 연결
                if (p != -1) {
                    next[p] = restore;
                }
                // 원래의 다음 행이 존재한다면, 그 행의 이전을 다시 restore로 연결
                if (nxt != -1) {
                    prev[nxt] = restore;
                }
            }
        }
        
        // 4. 출력 결과 만들기 (기본값은 모두 'O')
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            answer.append('O');
        }
        
        // 스택에 여전히 남아있는 인덱스들은 최종적으로 '삭제된 상태'인 것들임
        while (!deleted.isEmpty()) {
            answer.setCharAt(deleted.pop(), 'X');
        }
        
        return answer.toString();
    }
}