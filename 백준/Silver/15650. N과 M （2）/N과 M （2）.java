import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());

        visited=new boolean[N];

        dfs(0,M);
    }

    public static void dfs(int start, int r){

        if(r==0){
            for(int i=0;i<N;i++){
                if(visited[i]) System.out.print(i+1+" "); 
            }
            System.out.println();
            return;
        }

        for(int i=start;i<N;i++){
            visited[i]=true;
            dfs(i+1,r-1);
            visited[i]=false;
        }

    }
}
