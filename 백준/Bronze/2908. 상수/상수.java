import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();

        String aa="";
        String bb="";

        for(int i=a.length()-1;i>=0;i--){
            aa+=a.charAt(i);
        }

        for(int i=b.length()-1;i>=0;i--){
            bb+=b.charAt(i);
        }

        if(Integer.parseInt(aa)>Integer.parseInt(bb)){
            System.out.println(Integer.parseInt(aa));
        }
        else{
            System.out.println(Integer.parseInt(bb));
        }
    }
}
