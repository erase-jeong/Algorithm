import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int[] A=new int[N];

        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            A[i]=Integer.parseInt(st.nextToken());
        }

        int cnt=0;
        int left=0;
        int right=0;
        int currentSum=0;

        //right가 배열 끝에 도달할 때까지 반복
        while(true){
            if(currentSum>=M){
                currentSum-=A[left++];
            }else if(right==N){
                //더 이상 더할 숫자가 없으면 종료
                break;
            }else{
                //합이 M보다 작으면 오른족 숫자를 더해서 합을 증가시킴
                currentSum+=A[right++];
            }

            //합이 정확히 M이 되면 카운트
            if(currentSum==M){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
