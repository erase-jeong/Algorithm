import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        for(int tc=1;tc<=T;tc++){
            int sum=0;
            for(int i=0;i<10;i++){
                int num=sc.nextInt();
                sum+=num;
            }
            double average=sum/10.0;
            int rounded=(int)Math.round(average);
            System.out.println("#"+tc+" "+rounded);
        }
        sc.close();
    }
}