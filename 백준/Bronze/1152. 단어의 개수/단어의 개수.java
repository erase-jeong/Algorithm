import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st=new StringTokenizer(br.readLine());
        String str=br.readLine();
        str=str.trim();

        if(str.isEmpty()) System.out.println(0);
        else{
            String[] arr=str.split(" ");
            System.out.println(arr.length);
        }
    }
}