import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

    //메모이제이션을 위한 배열 (M,N 최대 30)
    static int[][] dp=new int[30][30];

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int T=Integer.parseInt(br.readLine()); //테스트 케이스 개수
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<T;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int N=Integer.parseInt(st.nextToken()); //서쪽(r)
            int M=Integer.parseInt(st.nextToken()); //동쪽(n)

            //M개 중에서 N개를 뽑는 경우의 수
            sb.append(combi(M,N)).append('\n');
        }
        System.out.println(sb);
    }

    //재귀 함수
    static int combi(int n, int r){
        ///  1. 이미 계산된 값이 있다면 그 값을 바로 반환 (가지치기)
        if(dp[n][r]>0){
            return dp[n][r];
        }
        /// 2. 기저 조건 (Base Case)
        // n개 중 0개를 뽑거나(r==0), n개 중 n개를 모두 뽑는 경우(n==r)는 1가지
        if(r==0 || n==r){
            return dp[n][r]=1;
        }

        /// 3. 재귀 호출
        //nCr=n-1Cr-1+n-1Cr
        return dp[n][r]=combi(n-1,r-1)+combi(n-1,r);
    }
}