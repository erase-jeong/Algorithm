import java.util.*;

class Solution {
    static HashMap<Integer, List<Integer>> map;
    static boolean[] visited;

    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;

        // 1. 그래프(양방향) 구성
        map = new HashMap<>();
        for (int[] w : wires) {
            int a = w[0];
            int b = w[1];

            map.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
            map.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
        }

        // 2. 하나씩 끊어보기
        for (int[] w : wires) {
            int a = w[0];
            int b = w[1];

            // 끊은 간선을 제외하기 위해 visited 초기화
            visited = new boolean[n + 1];

            // 한 쪽 트리의 크기를 구함
            int area1 = dfs(a, b);
            int area2 = n - area1;

            int diff = Math.abs(area1 - area2);
            answer = Math.min(answer, diff);
        }

        return answer;
    }

    // DFS: 특정 노드에서 탐색 가능한 송전탑 개수 반환
    private int dfs(int node, int cut) {
        visited[node] = true;
        int count = 1; // 자기 자신 포함

        for (int next : map.get(node)) {
            // 끊은 간선 방향은 건너뛰기
            if (next == cut || visited[next]) continue;
            count += dfs(next, node);
        }

        return count;
    }
}
