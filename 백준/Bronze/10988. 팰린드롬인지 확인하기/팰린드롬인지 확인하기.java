import java.io.*;

public class Main{
    public static void main(String args[]) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        //System.out.println(str.getClass().getName());

        boolean flag=true;


        for(int i=0;i<=str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
                flag=false;
                break;
            }
        }

        if(flag){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}