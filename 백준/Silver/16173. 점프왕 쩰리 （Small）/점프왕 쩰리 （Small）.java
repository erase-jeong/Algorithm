import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringBuilder out=new StringBuilder();
        int[][] map=new int[N][N];
        boolean[][] visited=new boolean[N][N];

        //아래, 오른쪽
        int[] dx={1,0}; //행
        int[] dy={0,1}; //열

        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        boolean find=false;

        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{0,0});
        visited[0][0]=true;

        while(!q.isEmpty()){
            int[] p=q.poll();
            int x=p[0];
            int y=p[1];

            if(map[x][y]==-1){
                out.append("HaruHaru");
                find=true;
                break;
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

        if(!find){
            out.append("Hing");
        }

        System.out.println(out);
    }
}
