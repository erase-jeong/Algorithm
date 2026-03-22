import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int m=Integer.parseInt(br.readLine());
        String s=br.readLine();
        int cnt=0;

        String find="";

        //홀수 : I, 짝수 O
        for(int i=1;i<=2*n+1;i++){
            if(i%2==1) find+="I";
            else find+="O";
        }
        //System.out.println("find :"+find);

        //System.out.println(s);
        for(int i=0;i<m;i++){
            if(i>m-(n*2+1)) break;
            //System.out.println(s.substring(i,i+(n*2+1)));
            String sub=s.substring(i,i+(n*2+1));
            if(sub.equals(find)){
                cnt++;
                //System.out.println(sub);
            }
        }
        System.out.println(cnt);
    }
}
