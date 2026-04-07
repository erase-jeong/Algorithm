import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        if(N==1){
            System.out.println(1);
        }
        else{
            int layer=1;
            int start=2;
            while(start<=N){  //2~7이면 layer=2로 출력 /8~19이면 layer=3로 출력
                start=start+(6*layer);
                layer++;
            }
            
            System.out.println(layer);

        }
    }
}