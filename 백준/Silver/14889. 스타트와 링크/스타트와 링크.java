import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] arr;
    static int ans;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine().trim());
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        M = N / 2;
        ans = 100 * M * M; // 파이썬 코드와 동일한 초기값

        dfs(0, new ArrayList<>(), new ArrayList<>());

        System.out.println(ans);
    }

    // n번째 사람을 A팀(alst) 또는 B팀(blst)에 배정
    static void dfs(int n, List<Integer> alst, List<Integer> blst) {
        // (주석 처리된 가지치기는 원본과 동일하게 사용하지 않음)

        if (n == N) {
            if (alst.size() == blst.size()) {
                int asm = 0, bsm = 0;
                // 파이썬 코드처럼 i==j 포함 전체 합 (arr[i][i]는 보통 0)
                for (int i = 0; i < M; i++) {
                    for (int j = 0; j < M; j++) {
                        asm += arr[alst.get(i)][alst.get(j)];
                        bsm += arr[blst.get(i)][blst.get(j)];
                    }
                }
                ans = Math.min(ans, Math.abs(asm - bsm));
            }
            return;
        }

        // A팀에 배정
        alst.add(n);
        dfs(n + 1, alst, blst);
        alst.remove(alst.size() - 1);

        // B팀에 배정
        blst.add(n);
        dfs(n + 1, alst, blst);
        blst.remove(blst.size() - 1);
    }
}
