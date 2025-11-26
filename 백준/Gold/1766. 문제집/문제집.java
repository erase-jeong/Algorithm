import java.util.*;
import java.io.*;

public class Main {
    static public int N;
    static int[] inDegree;
    static ArrayList<Integer>[] a;

    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        a=new ArrayList[N+1];
        //배열 초기화
        for(int i=0;i<=N;i++){
            a[i]=new ArrayList<>();
        }

        inDegree=new int[N+1];

        for(int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            int A=Integer.parseInt(st.nextToken());
            int B=Integer.parseInt(st.nextToken());

            a[A].add(B);
            inDegree[B]++;
        }

        topologySort();
    }

    public static void topologySort(){
        int[] result=new int[N+1];
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        //진입차수가 0인 노드를 우선순위 큐에 삽입
        for(int i=1;i<=N;i++){
            if(inDegree[i]==0){
                pq.add(i);
            }
        }

        //n개의 노드를 방문해야 정상
        for(int i=1;i<=N;i++){
            /*
            //큐가 비었다 = 처리할 노드가 없음 = 사이클 존재
            if(pq.isEmpty()){
                System.out.println("사이클이 발생했습니다.");
                return;
            }
            */

            int x=pq.poll();
            result[i]=x;

            //x에서 뻗어나가는 간선 제거 (진입차수 감소)
            for(int y:a[x]){
                inDegree[y]--;
                if(inDegree[y]==0){
                    pq.add(y);
                }
            }
        }

        //결과 출력
        for(int i=1;i<=N;i++){
            System.out.print(result[i]+" ");
        }


    }
}