import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int A=Integer.parseInt(st.nextToken());
        int B=Integer.parseInt(st.nextToken());
        int C=Integer.parseInt(st.nextToken());
        int D=Integer.parseInt(st.nextToken());

        //boolean so,sx; //이거 초기화해줘야 하나? 자동 초기화 false아닌가?
        boolean so=false;
        boolean sx=false;
        //얘네들 더 간단하게 하는법 생각해보기

        if(A+B<=D) so=true;
        if(C<=D) sx=true;

        //boolean if문 체크
        if(so&&sx) System.out.println("~.~");
        else if(!so&&!sx) System.out.println("T.T");
        else if(so) System.out.println("Shuttle");
        else System.out.println("Walk");
    }
}
