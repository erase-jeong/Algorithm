import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int K=Integer.parseInt(st.nextToken());
        int N=Integer.parseInt(st.nextToken());  //구하고자 하는 최소 랜선 길이 (cnt랑 비교)

        int[] light=new int[K];
        for(int i=0;i<K;i++){
            light[i]=Integer.parseInt(br.readLine());
        }

        Arrays.sort(light);


        long left=1;  //light[0] (x)
        long right=light[K-1];  //Q. light[K-1]인지, light[0]인지
        long answer=0;

        while(left<=right){
            long mid=(left+right)/2;
            if(mid==0L){
                break;
            }
            //long mid=(left/2)+(right/2);  ///long으로!!
            int cnt=0;  //계속 새롭게 계산해야하므로 while문 안에

            ///for문 정식
            for(int i=0;i<K;i++){
                cnt+=light[i]/mid;  //괄호 필요없나?
                //복합 대입에서 'long'에서 'int'(으)로의 묵시적 형 변환은 손실될 수 있습니다
                /// mid=0일때, 나누기 0되면 문제 생김
            }

            if(cnt<N){  //적으면 안된다.
                right=mid-1;  //mid냐 mid+1이냐
            }else {  //같거나 큰건 괜찮다. (**문제에서 N개보다 많이 만드는 것도 N개를 만드는 것에 포함)
                answer=mid;
                left=mid+1;
            }
        }
        System.out.println(answer);
    }
}
