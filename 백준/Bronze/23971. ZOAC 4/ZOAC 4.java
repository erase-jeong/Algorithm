import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int H=Integer.parseInt(st.nextToken());
        int W=Integer.parseInt(st.nextToken());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        
        int c=W/(M+1);
        if(W%(M+1)!=0) c+=1;

        int r=H/(N+1);
        if(H%(N+1)!=0) r+=1;

        System.out.print(c*r);
    }
}