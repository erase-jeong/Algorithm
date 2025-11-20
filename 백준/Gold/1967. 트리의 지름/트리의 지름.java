import java.io.*;
import java.util.*;

public class Main {

    static class Node {
        int to, weight;
        Node(int t, int w) {
            to = t;
            weight = w;
        }
    }

    static ArrayList<Node>[] tree;
    static boolean[] visited;
    static int[] dist;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());   // 노드 수

        // 인접 리스트 생성
        tree = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }

        // 간선 입력 — n-1개
        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            // 트리는 양방향으로 저장해야 함
            tree[parent].add(new Node(child, weight));
            tree[child].add(new Node(parent, weight));
        }

        // 1) 임의의 노드(1)에서 BFS → 가장 먼 노드 A 찾기
        Result r1 = bfs(1);

        // 2) A에서 BFS → 가장 먼 거리 = 지름
        Result r2 = bfs(r1.node);

        // 정답 출력
        System.out.println(r2.dist);
    }

    // BFS 결과: 가장 먼 노드 번호 + 거리
    static class Result {
        int node, dist;
        Result(int n, int d) {
            node = n;
            dist = d;
        }
    }

    // BFS: start에서 가장 먼 노드와 거리 찾기
    static Result bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        visited = new boolean[n + 1];
        dist = new int[n + 1];

        q.add(start);
        visited[start] = true;
        dist[start] = 0;

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (Node nxt : tree[cur]) {
                if (!visited[nxt.to]) {
                    visited[nxt.to] = true;
                    dist[nxt.to] = dist[cur] + nxt.weight;
                    q.add(nxt.to);
                }
            }
        }

        // dist 배열 중 가장 큰 값 찾기
        int maxNode = start;
        int maxDist = 0;

        for (int i = 1; i <= n; i++) {
            if (dist[i] > maxDist) {
                maxDist = dist[i];
                maxNode = i;
            }
        }

        return new Result(maxNode, maxDist);
    }
}
