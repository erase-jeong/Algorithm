import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    static int N;
    static long[] road;
    static long[] oil;

    static long money;

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //도시의 개수 N
        N=Integer.parseInt(br.readLine());
        //System.out.println(N);

        //도로의 길이  (총 N-1개)
        road=new long[N-1];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<N-1;i++){
            road[i]=Integer.parseInt(st.nextToken());
        }
        //System.out.println(Arrays.toString(road));

        //주유소 리터당 가격 (N개)
        oil=new long[N];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            oil[i]=Integer.parseInt(st.nextToken());
        }
        //System.out.println(Arrays.toString(oil));

        ///처음부터 마지막 도시로 이동하기
        long pickOil=oil[0];
        /// 첫 번째 도시 처리
        money+=pickOil*road[0];

        /// 두 번째부터 도시 처리
        for(int i=1;i<N-1;i++){  //종료 부등호 머리가 안돌아간다아
            //지금 도시가 아까넣었던 곳보다 더 싸다면?
            if(oil[i]<pickOil){
                //새로 갱신해서 넣는다..
                pickOil=oil[i];
            }
            money+=pickOil*road[i];
        }
        System.out.println(money);
    }

}
