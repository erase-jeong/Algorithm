import java.util.*;
import java.io.*;

public class Main {
     public static void main(String args[]) throws IOException{
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         String word=br.readLine();
         int[] alpha=new int[26];

         //-1로 초기화
         for(int i=0;i<26;i++){
             alpha[i]=-1;
         }

         for(int i=0;i<word.length();i++){
             if(alpha[word.charAt(i)-97]==-1){
                 alpha[word.charAt(i)-97]=i;
             }
         }


         for(int i=0;i<26;i++){
             System.out.print(alpha[i]+" ");
         }
         
     }
}