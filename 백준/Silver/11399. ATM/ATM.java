import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] S=new int[n];
        int answer=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        S[0]=arr[0];
        answer=S[0];
        for(int i=1;i<n;i++){
            S[i]=S[i-1]+arr[i];
            answer+=S[i];
        }

        System.out.println(answer);
    }
}