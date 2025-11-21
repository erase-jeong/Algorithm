import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        String a=st.nextToken();
        String b=st.nextToken();
        String aa="";
        String bb="";

        for(int i=a.length()-1;i>=0;i--){
            aa+=a.charAt(i);
            //System.out.println(aa);
        }

        for(int i=b.length()-1;i>=0;i--){
            bb+=b.charAt(i);
            //System.out.println(bb);
        }

        if(Integer.parseInt(aa)>Integer.parseInt(bb)){
            System.out.println(aa);
        }else{
            System.out.println(bb);
        }
    }
}