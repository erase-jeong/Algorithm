
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        int dasom=Integer.parseInt(br.readLine());
        int cnt=0;

        for(int i=1;i<N;i++){
            pq.add(Integer.parseInt(br.readLine()));
        }

        while(!pq.isEmpty()){
            int value=pq.poll();

            if(dasom>value) break;

            dasom+=1;
            cnt+=1;
            pq.add(value-1);
        }

        System.out.println(cnt);

    }
}