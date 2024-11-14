import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int T=sc.nextInt();

        int A=T/300;

        int B=(T%300)/60;

        int C=((T%300)%60)/10;

        int D=((T%300)%60)%10;
        
        if(D==0){
            System.out.println(A+" "+B+" "+C);
        }
        else{
            System.out.println("-1");
        }



    }
}
