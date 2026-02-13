import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[][] graph;
    static int[][] dist;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int find_r, find_c; // 2의 위치

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        dist = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                dist[i][j] = -1; // 일단 도달 불가로 초기화
                if (graph[i][j] == 2) {
                    find_r = i;
                    find_c = j;
                }
            }
        }

        bfs(find_r, find_c);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == 0) sb.append(0);
                else if (graph[i][j] == 2) sb.append(0);
                else sb.append(dist[i][j]); // graph==1인 칸: 거리 or -1
                if (j < m - 1) sb.append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    static void bfs(int sr, int sc) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sr, sc});
        dist[sr][sc] = 0;

        while (!q.isEmpty()) {
            int[] p = q.poll();
            int r = p[0], c = p[1];

            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d];
                int nc = c + dc[d];

                if (nr < 0 || nc < 0 || nr >= n || nc >= m) continue;
                if (graph[nr][nc] == 0) continue;     // 못 가는 땅
                if (dist[nr][nc] != -1) continue;     // 이미 최단거리 확정

                dist[nr][nc] = dist[r][c] + 1;
                q.add(new int[]{nr, nc});
            }
        }
    }
}
