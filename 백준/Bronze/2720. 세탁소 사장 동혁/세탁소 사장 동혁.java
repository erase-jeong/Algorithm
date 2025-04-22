import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int T,C;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            C=Integer.parseInt(br.readLine());

            System.out.print(C/25+" ");
            System.out.print((C%25)/10+" ");
            System.out.print(((C%25)%10)/5+" ");
            System.out.println(((C%25)%10)%5);

        }

    }
}