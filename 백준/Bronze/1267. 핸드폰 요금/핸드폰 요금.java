import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        int[] callList=new int[n];

        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            callList[i]=Integer.parseInt(st.nextToken());
        }

        br.close();

        int yPrice=0;
        int mPrice=0;
        for(int callTime:callList){
            yPrice+=(callTime/30+1)*10;
            mPrice+=(callTime/60+1)*15;
        }

        if(yPrice<mPrice){
            System.out.println("Y "+yPrice);
        }else if(yPrice>mPrice){
            System.out.println("M "+mPrice);
        }else{
            System.out.println("Y M "+yPrice);
        }
    }
}