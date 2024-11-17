import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        String n_str=Integer.toString(n);

        int left=0,right=0;

        for(int i=0;i<n_str.length()/2;i++){
            left+=Integer.parseInt(String.valueOf(n_str.charAt(i)));
        }

        for(int i=n_str.length()/2;i<n_str.length();i++){
            right+=Integer.parseInt(String.valueOf(n_str.charAt(i)));
        }
        
        if(left==right){
            System.out.println("LUCKY");
        }
        else{
            System.out.println("READY");
        }

    }
}
