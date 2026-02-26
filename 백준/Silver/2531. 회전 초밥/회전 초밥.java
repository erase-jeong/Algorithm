import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 접시 수
        int d = Integer.parseInt(st.nextToken()); // 초밥 가짓수
        int k = Integer.parseInt(st.nextToken()); // 연속해서 먹는 접시 수
        int c = Integer.parseInt(st.nextToken()); // 쿠폰 번호

        int[] sushi = new int[N];
        for (int i = 0; i < N; i++) {
            sushi[i] = Integer.parseInt(br.readLine());
        }

        // 각 초밥 종류가 현재 윈도우에 몇 개 있는지 저장하는 배열
        int[] eaten = new int[d + 1];
        
        int totalTypes = 0; // 현재 윈도우 안의 유효한 초밥 종류 수
        int maxTypes = 0;

        // 1. 처음 k개의 초밥을 윈도우에 넣기 (초기 세팅)
        for (int i = 0; i < k; i++) {
            if (eaten[sushi[i]] == 0) {
                totalTypes++;
            }
            eaten[sushi[i]]++;
        }
        
        // 초기 윈도우 상태에서 쿠폰 초밥 고려하여 최댓값 갱신
        maxTypes = totalTypes;
        if (eaten[c] == 0) maxTypes = totalTypes + 1;

        // 2. 슬라이딩 윈도우 시작
        // i는 윈도우에서 빠지는(왼쪽) 인덱스
        for (int i = 0; i < N; i++) {
            // 왼쪽 초밥 제거
            eaten[sushi[i]]--;
            if (eaten[sushi[i]] == 0) {
                totalTypes--;
            }

            // 오른쪽 초밥 추가 (원형 벨트이므로 % N 연산 사용)
            int rightIndex = (i + k) % N;
            if (eaten[sushi[rightIndex]] == 0) {
                totalTypes++;
            }
            eaten[sushi[rightIndex]]++;

            // 3. 쿠폰 초밥 확인 및 최댓값 갱신
            int currentMax = totalTypes;
            if (eaten[c] == 0) {
                currentMax++;
            }
            maxTypes = Math.max(maxTypes, currentMax);
            
            // 모든 종류를 다 먹을 수 있는 경우라면 더 이상 계산할 필요 없음 (최적화)
            if (maxTypes == k + 1) break;
        }

        System.out.println(maxTypes);
    }
}