import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long[] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        arr=new long[101];
        arr[1]=1;
        arr[2]=1;
        arr[3]=1;
        arr[4]=2; //arr[3]+arr[1] = 1+1
        arr[5]=2; //arr[4] = 1+1
        arr[6]=3; //arr[5]+arr[3] = 2+1 = arr[5]+arr[1]
        arr[7]=4; //arr[6]+arr[2] = 3+1
        arr[8]=5; //arr[7]+arr[1] = 4+1 = arr[7]+arr[3]
        arr[9]=7; //arr[8]+arr[4] = 5+2
        arr[10]=9; //arr[9]+arr[5] = 7+2
        arr[11]=12; //arr[10]+arr[6] = 9 + 3 = 12
        arr[12]=16; //arr[11]+arr[7] = 12 + 4 = 16

        for(int i=6;i<101;i++){
            arr[i]=arr[i-1]+arr[i-5];
        }

        for(int tc=0;tc<T;tc++){
            int n=Integer.parseInt(br.readLine());
            System.out.println(arr[n]);
        }


    }
}
