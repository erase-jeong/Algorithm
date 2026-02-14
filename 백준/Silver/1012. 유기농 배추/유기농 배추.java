import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int m;
    static int n;
    static int k;

    static int[][] map;

    static int[] dr={-1,1,0,0};
    static int[] dc={0,0,-1,1};

    static boolean[][] visited;

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            //m,n,k;
            m=Integer.parseInt(st.nextToken());  //가로길이 => 열
            n=Integer.parseInt(st.nextToken()); //세로길이 => 헹
            k=Integer.parseInt(st.nextToken()); //배추위치

            map=new int[n][m];
            visited=new boolean[n][m];

            ///입력받기
            for(int j=0;j<k;j++){
                st=new StringTokenizer(br.readLine());
                //배추위치는 x,y(열,행)으로 주어짐
                //근데 그냥 좌우 반대로 해도 될꺼같음
                //일단은 정석 풀이
                int x=Integer.parseInt(st.nextToken());  //x축 (열)
                int y=Integer.parseInt(st.nextToken());  //y축 (행)
                map[y][x]=1;
            }

            int answer=0;

            for(int i=0;i<n;i++){  //행
                for(int j=0;j<m;j++){  //열
                    if(map[i][j]==1 && !visited[i][j]){
                        bfs(i,j);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }

    }

    static int bfs(int r, int c){
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{r,c});
        int size=1;
        visited[r][c]=true;

        while(!q.isEmpty()){
            int[] p=q.poll();
            int pr=p[0];
            int pc=p[1];

            for(int d=0;d<4;d++){
                int nr=pr+dr[d];
                int nc=pc+dc[d];

                if(nr<0 || nc<0 || nr>n-1 || nc>m-1) continue;
                if(visited[nr][nc]) continue;

                if(map[nr][nc]==1){
                    size++;
                    visited[nr][nc]=true;
                    q.add(new int[]{nr,nc});
                }
            }
        }
        return size;
    }
}
