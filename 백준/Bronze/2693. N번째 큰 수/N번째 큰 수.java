import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
            for(int j=0;j<10;j++){
                int x=Integer.parseInt(st.nextToken());
                queue.add(x);
            }

            queue.poll();
            queue.poll();
            System.out.println(queue.poll());
            
            queue.clear();

        }
    }
}
