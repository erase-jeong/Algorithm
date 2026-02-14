import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    //static int[][] graph;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int m=Integer.parseInt(br.readLine());

        //선언
        graph=new ArrayList<>();

        for(int i=0;i<n+1;i++){
            graph.add(new ArrayList<>());
        }
        visited=new boolean[n+1];

        for(int i=0;i<m;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            //graph[i][0]=Integer.parseInt(st.nextToken());
            //graph[i][1]=Integer.parseInt(st.nextToken());

            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            //graph.add(a).get(b);
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        //bfs(1);
        System.out.println(bfs(1));
    }

    static int bfs(int start){
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        visited[start]=true;

        int cnt=0;

        while(!q.isEmpty()){
            int node=q.poll();
            //꺼낸 노드와 연결되어 있는거 + visited가 아닌거
            for(int i=0;i<graph.get(node).size();i++){
                //System.out.println(graph.get(node).get(i));
                int nextNode=graph.get(node).get(i);
                if(!visited[nextNode]){
                    visited[nextNode]=true;
                    q.add(nextNode);
                    cnt++;
                }
            }

        }
        return cnt;

    }
    
}
