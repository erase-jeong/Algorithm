import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());

        List<int[]> jewel=new ArrayList<>(); //[무게, 가치]
        int[] bags=new int[k];

        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            int m=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            jewel.add(new int[]{m,v});
        }

        for(int i=0;i<k;i++){
            bags[i]=Integer.parseInt(br.readLine());
        }

        //보석을 무게 오름차순 정렬
        jewel.sort((o1,o2)->o1[0]-o2[0]);

        //가방 용량 오름차순 정렬
        Arrays.sort(bags);

        //가치가 큰 보석을 먼저 꺼내기 위한 최대 힙
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        long answer=0; //합이 int이 범위를 넘을 수 있어서 long으로
        int idx=0; //jewel 리스트에서 어디까지 봤는지 가리키는 인덱스

        //4. 가벼운 가방부터 하나씩 처리
        for(int i=0;i<k;i++){
            int bagCapcity=bags[i];

            //이 가방에 들어갈 수 있는 모든 보석을 pq에 넣기
            while(idx<n && jewel.get(idx)[0]<=bagCapcity){
                pq.offer(jewel.get(idx)[1]); //가치만 넣음
                idx++;
            }

            //pq 안에서 지금까지 넣은 보석들 중 가장 비싼 것 하나 선택
            if(!pq.isEmpty()){
                answer+=pq.poll();
            }
        }

        System.out.println(answer);

    }
}
