import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();

        for(int i=1;i<=9;i++){
            int price=sc.nextInt();
            sum-=price;
        }

        System.out.println(sum);


    }
}