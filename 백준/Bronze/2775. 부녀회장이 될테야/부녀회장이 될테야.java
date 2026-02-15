import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int tc=0;tc<t;tc++) {
            int n = Integer.parseInt(br.readLine());
            int k = Integer.parseInt(br.readLine());

            int[][] apt = new int[n + 1][k + 1];

            //행 0번째(0번 층) 초기화
            for(int i=0;i<k+1;i++){
                apt[0][i]=i;
            }

            //조건
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < k + 1; j++) {
                    apt[i][j] = apt[i - 1][j] + apt[i][j - 1];
                }
            }

            System.out.println(apt[n][k]);
        }
    }
}
