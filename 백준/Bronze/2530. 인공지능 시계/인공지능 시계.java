import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //int H,M,S=Integer.parseInt(br.readLine());
        String[] input=br.readLine().split(" ");
        int H=Integer.parseInt(input[0]);
        int M=Integer.parseInt(input[1]);
        int S=Integer.parseInt(input[2]);

        int D=Integer.parseInt(br.readLine());

        //초(sec) 계산타임
        S+=D%60;
        D=D/60;

        if(S>=60){
            S-=60;
            M+=1;
        }

        //분(min) 계산타임
        M+=D%60;
        D=D/60;

        if(M>=60){
            M-=60;
            H+=1;
        }

        //시(hour) 계산타임
        H+=D%24;

        if(H>=24){
            H-=24;
        }

        System.out.println(H+" "+M+" "+S);

    }
}
