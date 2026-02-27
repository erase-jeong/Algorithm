import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[] dx={0,0,-1,1,-1,-1,1,1};
    static int[] dy={-1,1,0,0,-1,1,-1,1};
    static int w;
    static int h;

    static int[][] map;

    static int cnt;

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


        while(true){
            StringTokenizer st=new StringTokenizer(br.readLine());
            w=Integer.parseInt(st.nextToken());
            h=Integer.parseInt(st.nextToken());

            if(w==0 && h==0) break;

            //지도 입력받기
            map=new int[h][w];

            for(int i=0;i<h;i++){
                st=new StringTokenizer(br.readLine());
                for(int j=0;j<w;j++){
                    map[i][j]=Integer.parseInt(st.nextToken());
                }
            }

            cnt=0;

            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if(map[i][j]==1) {
                        bfs(i,j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    public static void bfs(int i, int j){
        //큐 선언
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{i,j});

        while(!q.isEmpty()){
            int[] p=q.poll();
            int x=p[0];
            int y=p[1];

            //상하좌우 확인
            for(int d=0;d<8;d++){
                int nx=x+dx[d];
                int ny=y+dy[d];

                //범위를 벗어나면 -> out
                if(nx<0 || ny<0 || nx>h-1 || ny>w-1) continue;

                //값이  0이라면 -> out
                if(map[nx][ny]==0) continue;

                q.offer(new int[]{nx,ny});
                map[nx][ny]=0;
            }
        }
    }
}
