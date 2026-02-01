import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());

        int[] arr=new int[N];

        st=new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        int max=Integer.MIN_VALUE;
        int cur=0;

        //int cnt_max=0;
        for(int i=0;i<=N-K;i++){ //시작점 설정
            cur=0;

            for(int j=i;j<i+K;j++){ ///  j+K , i+K
                cur+=arr[j];
            }

            if(max<cur){
                max=cur;
            }
        }

        System.out.println(max);

    }
}
