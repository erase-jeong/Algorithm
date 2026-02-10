import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        int X=Integer.parseInt(st.nextToken());

        int[] arr=new int[N];

        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        /*
        //1<X<N<250,000
        //250000*(250000+250000) = 250000 * 500000 = 100 0000 0000 = 2^10 ?
        //N , X
        //N개
        //N-X+1
        for(int i=0;i<N-X+1;i++){  //i=0 ~ i<3
            int ans=0;
            for(int j=i;j<i+X;j++){  //j<j+X (x) , j<i+X (o)
                //i
                //i+X
                ans+=arr[j];
                //i=0, j=0, j<0+2
                //i=1, j=1, j<1+2
                //i=2, j=2, j<2+2
                //i=3 j=3, j<3+2
            }
            pq.add(ans);
        }
        */

        int sum=0;
        for(int i=0;i<X;i++) sum+=arr[i];
        pq.add(sum);

        for(int i=X;i<N;i++){ // 3, 4, 5
            sum+=arr[i]-arr[i-X];  // +arr[3]-arr[3-3], //+arr[4]-arr[4-3]
            pq.add(sum);
        }

        //모두 다 0이라면 => sad
        //아니라면 => 값 출력

        int cnt=0; int value;
        if(pq.peek()==0){
            System.out.println("SAD");
        }else{
            value=pq.peek();
            while(!pq.isEmpty()){
                if(pq.poll()==value) cnt++;
            }
            System.out.println(value);
            System.out.println(cnt);
        }

    }
}