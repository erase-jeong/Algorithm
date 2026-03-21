import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[] dr={-1,1,0,0};  //
    static int[] dc={0,0,-1,1};
    static char[][] map;
    static int answer;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());

        map=new char[N][M];
        answer=0;  //여기서 선언안해주면 뭔 문제가 생기지?
        visited=new boolean[N][M]; //이거 맞나? 왜냐면 경로 여러개 나뉘면서
        //다른 방식으로 예전에 갔던 길 또 갈 수 있는거 아닌가?

        int start_r=0, start_c=0; //이렇게 초기화를 해둬야 하나?
        for(int i=0;i<N;i++){
            String line=br.readLine();
            for(int j=0;j<line.length();j++){
                map[i][j]=line.charAt(j);
                if(map[i][j]=='I'){  //시작점은 도연이의 위치
                    start_r=i;
                    start_c=j;
                }
            }
        }

        bfs(start_r,start_c);
        if(answer==0) System.out.println("TT");
        else System.out.println(answer);

    }

    static void bfs(int x, int y){
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{x,y});
        visited[x][y]=true; //첫 지점도 방문처리 하고 시작

        while(!q.isEmpty()){
            int[] p=q.poll();
            int r=p[0];
            int c=p[1];

            for(int d=0;d<4;d++){
                int nr=r+dr[d];
                int nc=c+dc[d];

                //1.범위를 벗어나면 패스
                if(nr<0 || nc<0 ||nr>N-1 || nc>M-1) continue;

                //2.이미 방문했거나 벽('X')이면 패스
                if(visited[nr][nc] || map[nr][nc]=='X') continue;

                //3. 이제 방문 가능한 곳이니 방문 처리!
                visited[nr][nc]=true;

                //4.사람이라면 정답 추가
                if(map[nr][nc]=='P'){
                    answer++;
                }

                //5.다음 탐색을 위해 큐에 삽입(O든 P든 이동 가능)
                q.add(new int[]{nr,nc});
            }
        }

    }
}
