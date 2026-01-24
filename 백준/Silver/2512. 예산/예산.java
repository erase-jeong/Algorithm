import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[] gover=new int[N];

        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            gover[i]=Integer.parseInt(st.nextToken());
        }
        int M=Integer.parseInt(br.readLine());




        //(1) 합을 더한다.
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=gover[i];
        }


        //합보다 작은지 확인
        if(sum<M){ //총 예산보다 적으면
            //남은 값들 중에서 최댓값을 출력한다.
            int max_v=Integer.MIN_VALUE;
            for(int i=0;i<N;i++){
                if(gover[i]>max_v) max_v=gover[i];
            }
            System.out.println(max_v);
        }
        else{
            int answer=M/N;
            while(true){
                int now_sum=0; //계속 int로 선언되도 괜찮은건가?
                for(int i=0;i<N;i++){
                    if(gover[i]<answer) now_sum+=gover[i];
                    else now_sum+=answer;
                }
                if(M>now_sum) answer++;
                else if(M==now_sum) {
                    System.out.println(answer);
                    break;
                }
                else{
                    System.out.println(--answer);
                    break;
                }
            }
        }

    }
}
