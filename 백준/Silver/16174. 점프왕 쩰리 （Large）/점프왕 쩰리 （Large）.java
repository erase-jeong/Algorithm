import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] map;
    static boolean[][] visited;

    //아래, 오른쪽
    static int[] dx={1,0}; //행
    static int[] dy={0,1}; //열

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());

        map=new int[N][N];
        visited=new boolean[N][N];

        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(bfs());

    }

    static String bfs(){
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{0,0});
        visited[0][0]=true;

        while(!q.isEmpty()){
            int[] p=q.poll();
            int x=p[0];
            int y=p[1];

            if(map[x][y]==-1){
                return "HaruHaru";
            }

            for(int d=0;d<2;d++){
                int nx=x+dx[d]*map[x][y];
                int ny=y+dy[d]*map[x][y];

                if(nx<0 || nx>N-1 || ny<0 || ny>N-1) continue;
                if(visited[nx][ny]) continue;
                visited[nx][ny]=true;
                q.offer(new int[]{nx,ny});
            }
        }
        return "Hing";
    }
}