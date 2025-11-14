import java.util.PriorityQueue;
import java.util.*;

public class Main {
    public static void main(String args[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            pq.offer(x);
        }

        int sum=0;
        int a,b,temp;


        while(pq.size()>=2){
            a=pq.poll();
            b=pq.poll();
            temp=a+b;
            sum+=temp;
            pq.offer(temp);

        }

        System.out.println(sum);

    }
}