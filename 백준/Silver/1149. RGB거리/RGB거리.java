import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[][] rgb=new int[N][3];
        int answer=Integer.MAX_VALUE;

        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            rgb[i][0]=Integer.parseInt(st.nextToken());
            rgb[i][1]=Integer.parseInt(st.nextToken());
            rgb[i][2]=Integer.parseInt(st.nextToken());
        }

        for(int i=1;i<N;i++){
            for(int j=0;j<3;j++){
                rgb[i][j]+=Math.min(rgb[i-1][(j+1)%3],rgb[i-1][(j+2)%3]);
            }
        }
        
        for(int i=0;i<3;i++){
            answer=Math.min(answer,rgb[N-1][i]);
        }

        System.out.println(answer);
    }
}
