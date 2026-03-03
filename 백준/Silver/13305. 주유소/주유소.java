import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] road;
    static int[] oil;

    static int money;

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //도시의 개수 N
        N=Integer.parseInt(br.readLine());
        //System.out.println(N);

        //도로의 길이  (총 N-1개)
        road=new int[N-1];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<N-1;i++){
            road[i]=Integer.parseInt(st.nextToken());
        }
        //System.out.println(Arrays.toString(road));

        //주유소 리터당 가격 (N개)
        oil=new int[N];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            oil[i]=Integer.parseInt(st.nextToken());
        }
        //System.out.println(Arrays.toString(oil));

        while(true){
            //System.out.println("---반복문---");

            ///가장 저렴한 주유소 찾기
            int min=Integer.MAX_VALUE;
            int idx=0; //초기값 뭐로 설정해야하지?
            for(int i=0;i<N-1;i++){
                if(oil[i]<min) {
                    min=oil[i];
                    idx=i;
                }
            }
            //System.out.println("주유소 찾기(oil) : "+Arrays.toString(oil));
            //System.out.println("idx : "+idx+", min : "+min);

            ///이 뒤에부터 거리는 이 가격으로
            int dist=0; //총 거리  (금액은 위에서 구해둔 min값으로)
            for(int i=idx;i<N-1;i++){
                dist+=road[i];
                road[i]=0;
                oil[i]=Integer.MAX_VALUE;
            }
            money+=min*dist;
            //System.out.println("money : "+money);
            //System.out.println("road : "+Arrays.toString(road));
            //System.out.println("oil : "+Arrays.toString(oil));

            if(isFinish()){
                System.out.println(money);
                break;
            }
            //System.out.println("종료 실패!");

        }
    }

    //내가 이런 로직처리를 너무 비효율적으로 함. 단점
    static boolean isFinish(){
        int cnt=0;
        for(int i=0;i<N-1;i++){
            if(road[i]==0){
                cnt++;
            }
        }
        if(cnt==N-1) return true;
        else return false;
    }
}