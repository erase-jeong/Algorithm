import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String line=br.readLine();

        int[] check=new int[14];

        
        for(int i=0;i<line.length();i++){
            if(line.charAt(i)=='R') check[0]=1;
            else if(line.charAt(i)=='O') check[1]=1;
            else if(line.charAt(i)=='Y') check[2]=1;
            else if(line.charAt(i)=='G') check[3]=1;
            else if(line.charAt(i)=='B') check[4]=1;
            else if(line.charAt(i)=='I') check[5]=1;
            else if(line.charAt(i)=='V') check[6]=1;
            else if(line.charAt(i)=='r') check[7]=1;
            else if(line.charAt(i)=='o') check[8]=1;
            else if(line.charAt(i)=='y') check[9]=1;
            else if(line.charAt(i)=='g') check[10]=1;
            else if(line.charAt(i)=='b') check[11]=1;
            else if(line.charAt(i)=='i') check[12]=1;
            else if(line.charAt(i)=='v') check[13]=1;
        }

        boolean big=true;
        for(int i=0;i<7;i++){
            if(check[i]==0){
                big=false;
                break;
            }
        }

        boolean small=true;
        for(int i=7;i<14;i++){
            if(check[i]==0){
                small=false;
                break;
            }
        }


        if(small && big){
            System.out.println("YeS");
        }else if(small && !big){
            System.out.println("yes");
        }else if(!small && big){
            System.out.println("YES");
        }else{ //둘 다 불가능
            System.out.println("NO!");
        }
    }
}