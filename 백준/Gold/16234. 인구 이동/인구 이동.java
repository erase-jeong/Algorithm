import java.io.*;
import java.util.*;

public class Main {

    static int N, L, R;
    static int[][] arr;
    static boolean[][] visited;

    // 네 방향 탐색
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class Pos {
        int x, y;
        Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    // BFS 탐색
    static int bfs(int si, int sj) {
        Queue<Pos> q = new LinkedList<>();
        List<Pos> union = new ArrayList<>();

        q.add(new Pos(si, sj));
        visited[si][sj] = true;
        union.add(new Pos(si, sj));

        int sum = arr[si][sj];

        while (!q.isEmpty()) {
            Pos cur = q.poll();
            int cx = cur.x;
            int cy = cur.y;

            for (int d = 0; d < 4; d++) {
                int nx = cx + dx[d];
                int ny = cy + dy[d];

                if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[nx][ny]) {
                    int diff = Math.abs(arr[cx][cy] - arr[nx][ny]);
                    if (diff >= L && diff <= R) {
                        q.add(new Pos(nx, ny));
                        visited[nx][ny] = true;
                        union.add(new Pos(nx, ny));
                        sum += arr[nx][ny];
                    }
                }
            }
        }

        // 연합 크기가 1 초과면 인구 재분배
        if (union.size() > 1) {
            int newVal = sum / union.size();
            for (Pos p : union) {
                arr[p.x][p.y] = newVal;
            }
            return 1; // 연합이 있었음
        }
        return 0; // 연합 없었음
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = 0;

        while (ans <= 2000) {
            visited = new boolean[N][N];
            int flag = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j]) {
                        flag = Math.max(flag, bfs(i, j));
                    }
                }
            }

            if (flag == 0) { // 이동이 없었음
                break;
            }
            ans++;
        }

        System.out.println(ans);
    }
}