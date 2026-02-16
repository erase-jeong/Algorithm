import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    static int[][] table;
    static int[][] dp;

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        dp=new int[N+1][N+1];

        for(int i=1;i<N+1;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=1;j<N+1;j++){
                int value=Integer.parseInt(st.nextToken());
                /// 현재 칸의 누적 합 = 위쪽 합 + 왼쪽 합 - 대각선 위(중복 합) + 현재 값
                dp[i][j]=dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1]+value;
            }
        }
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            // x: 행 , y : 열
            int x1=Integer.parseInt(st.nextToken());
            int y1=Integer.parseInt(st.nextToken());
            int x2=Integer.parseInt(st.nextToken());
            int y2=Integer.parseInt(st.nextToken());

            //구간합 계싼
            /// 전체 - 위쪽 - 왼쪽 + 중복해서 뺀 대각선 부분
            int ans=dp[x2][y2]-dp[x1-1][y2]-dp[x2][y1-1]+dp[x1-1][y1-1];
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }
}