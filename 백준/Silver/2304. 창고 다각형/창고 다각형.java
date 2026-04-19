import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][2];

        int maxH = 0;
        int maxIdx = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            map[i][0] = Integer.parseInt(st.nextToken());
            map[i][1] = Integer.parseInt(st.nextToken());
        }

        // x좌표 기준 정렬
        Arrays.sort(map, (o1, o2) -> o1[0] - o2[0]);

        // 가장 높은 기둥 찾기
        for (int i = 0; i < N; i++) {
            if (map[i][1] > maxH) {
                maxH = map[i][1];
                maxIdx = i;
            }
        }

        int sum = 0;

        // 1. 왼쪽에서 최고점까지 스캔
        int leftX = map[0][0];
        int leftH = map[0][1];
        for (int i = 1; i <= maxIdx; i++) {
            if (map[i][1] >= leftH) {
                sum += (map[i][0] - leftX) * leftH;
                leftX = map[i][0];
                leftH = map[i][1];
            }
        }

        // 2. 오른쪽에서 최고점까지 역방향 스캔
        int rightX = map[N - 1][0];
        int rightH = map[N - 1][1];
        for (int i = N - 2; i >= maxIdx; i--) {
            if (map[i][1] >= rightH) {
                sum += (rightX - map[i][0]) * rightH;
                rightX = map[i][0];
                rightH = map[i][1];
            }
        }

        // 3. 마지막으로 최고점 기둥 자체의 면적(너비 1) 더하기
        sum += maxH;

        System.out.println(sum);
    }
}
