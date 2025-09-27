import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        int answer=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());

        int[] coins=new int[n];

        for(int i=0;i<n;i++){
            coins[i]=Integer.parseInt(br.readLine());
        }

        //반대기준으로
        for(int i=n-1;i>=0;i--){
            answer+=k/coins[i];
            k%=coins[i];
            //System.out.println(coins[i]+" "+answer+" "+k);
        }
        
        System.out.println(answer);
    }
}


