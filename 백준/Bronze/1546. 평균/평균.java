import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.nextLine();
        int[] arr=new int[n];

        int maxV=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>maxV){
                maxV=arr[i];
            }
        }

        //System.out.println("Max : "+maxV);
        //System.out.println(Arrays.toString(arr));

        float sumV=0;

        for(int i=0;i<n;i++){
            sumV+=(float)arr[i]/(float)maxV*(float)100;
        }

        //System.out.println("sumV : "+sumV);
        System.out.println(sumV/n);
    }
}