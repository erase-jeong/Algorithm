import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }

        //System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        //산술평균
        //System.out.println(sum/n);  //반올림 로직 확인하기
        //System.out.printf("%.1f", (double) sum / n);
        System.out.println(Math.round((double)sum/n));

        //중앙값
        System.out.println(arr[n/2]);

        //최빈값
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.computeIfAbsent(arr[i],k->0);
            hm.put(arr[i],hm.get(arr[i])+1);
        }

        //System.out.println("hm : "+hm);

        int maxCount=Integer.MIN_VALUE;

        //제일 작은 카운트 확인하기
        for(Integer in : hm.keySet()){
            if(hm.get(in)>maxCount){
                maxCount=hm.get(in);
            }
        }

        //제일 작은 카운트에 해당하는 key들을 우선순위 큐에 넣기
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(Integer in:hm.keySet()){
            if(hm.get(in)==maxCount){
                pq.offer(in);
            }
        }

        //System.out.println("pq : "+pq);

        if(pq.size()==1){
            System.out.println(pq.peek());
        }else{
            pq.poll();
            System.out.println(pq.peek());
        }

        //System.out.println("maxKey : "+maxKey+", maxValue : "+maxCount);


        //범위
        System.out.println(arr[n-1]-arr[0]);
    }
}