import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[] arr;
    static boolean[] visited;
    static int[] result;

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());


        visited=new boolean[N+1];
        result=new int[M];

        func(0);

    }

    public static void func(int depth){
        if(depth==M){  
            for(int i=0;i<M;i++){
                System.out.print(result[i]+" ");
            }
            System.out.println();
            return;
        }

        for(int i=1;i<N+1;i++){
            if(!visited[i]){
                visited[i]=true;
                result[depth]=i;
                func(depth+1);
                visited[i]=false;
            }
        }
    }
}