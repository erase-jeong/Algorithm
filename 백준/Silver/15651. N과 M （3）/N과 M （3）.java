import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] result;
    static int N,M;
    static StringBuilder sb=new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());

        result=new int[M];

        dfs(1,0);
        System.out.println(sb);
    }

    public static void dfs(int start, int depth){
        if(depth==M){  // 종료조건
            for(int val : result){
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=1;i<=N;i++){
            result[depth]=i;
            dfs(i+1,depth+1);
        }
    }
}
