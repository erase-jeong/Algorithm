import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        int score=Integer.parseInt(st.nextToken());
        int P=Integer.parseInt(st.nextToken());

        int[] arr=new int[N];

        if(N>0){
            st=new StringTokenizer(br.readLine()); //문제의 조건에서 애초에 내림차순으로 입력받고 있음
            for(int i=0;i<N;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
        }

        //아무도 없으면 1등 (P>=10)
        if(N==0){
            System.out.println(1);
            return;
        }

        //이미 꽉 찼고, 내 점수가 꼴등보다 작거나 같으면 못들어감
        if(N==P && arr[N-1]>=score){  //어차피 내림차순으로 들어오니깐
            System.out.println(-1);
            return;
        }

        //내 점수보다 큰 점수 세기
        int rank=1;
        for(int i=0;i<N;i++){
            if(arr[i]>score){
                rank++;
            }else{
                break;
            }
        } //어차피 예제 2번같은 케이스는 위에 if문에서 걸림

        System.out.println(rank);
    }
}