import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();

        String[] cro={"c=","c-","dz=","d-","lj","nj","s=","z="};

        for(int i=0;i<cro.length;i++){
            if(word.contains(cro[i])){
                word=word.replaceAll(cro[i],"A");
            }
        }

        System.out.println(word.length());

    }
}