
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }

        Arrays.sort(A);
        int m=sc.nextInt();

        for(int i=0;i<m;i++){
            int target = sc.nextInt();
            boolean find = false;

            int start = 0;
            int end = A.length - 1;

            while(start<=end){
                int mid = (start + end) / 2;

                if (A[mid]> target) {
                    end = mid - 1;
                } else if (A[mid] < target) {
                    start = mid + 1;
                } else {
                    find = true;
                    break;
                }
            }

            if (find) System.out.println(1);
            else System.out.println(0);
        }



    }
}