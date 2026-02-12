import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dr={-1,1,0,0};  //행
    static int[] dc={0,0,-1,1};  //열

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());

        graph=new int[n][m];
        visited=new boolean[n][m];

        //입력받기
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                graph[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        //함수 호출
        int cnt=0; int max=0;
        //int cnt=0,max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(graph[i][j]==1 && !visited[i][j]){
                    max=Math.max(max,bfs(i,j));
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        System.out.println(max);
    }

    static int bfs(int r,int c){
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{r,c});
        visited[r][c]=true;
        int size=1;

        while(!q.isEmpty()){
            int[] p=q.poll();
            int pr=p[0];
            int pc=p[1];

            for(int d=0;d<4;d++){
                int nr=pr+dr[d];
                int nc=pc+dc[d];

                if(nr<0 || nc<0 || nr>n-1 || nc>m-1) continue;
                if(visited[nr][nc]) continue;
                if(graph[nr][nc]==1){
                    size++;
                    visited[nr][nc]=true;
                    q.add(new int[]{nr,nc});
                }
            }
        }
        return size;
    }
}
