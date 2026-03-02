import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int[][] map;
    static int[] dr={-1,1,0,0};
    static int[] dc={0,0,-1,1};

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        map=new int[N][N];

        State baby=null;

        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
                if(map[i][j]==9){
                    baby=new State(i,j,2,0,0);
                    map[i][j]=0; //상어가 있던 자리는 빈칸으로 처리
                }
            }
        }

        int totalTime=0;

        while(true){
            boolean[][] visited=new boolean[N][N];
            Queue<State> q=new LinkedList<>();
            List<State> candidates=new ArrayList<>();

            //아기 상어의 현재 위치에서 탐색 시작
            q.add(new State(baby.r, baby.c, baby.size, baby.eat, 0));
            visited[baby.r][baby.c]=true;

            int minDist=Integer.MAX_VALUE;

            while(!q.isEmpty()){
                State cur=q.poll();

                //이미 찾은 최소 거리보다 멀어지면 더 탐색할 필요 없음
                if(cur.dist>minDist) continue;

                for(int i=0;i<4;i++){
                    int nr=cur.r+dr[i];
                    int nc=cur.c+dc[i];

                    //범위 체크 및 방문 체크
                    if(nr>=0 && nr<N && nc>=0 && nc<N && !visited[nr][nc]){
                        //이동 가능 조건 : 빈칸이거나 물고기 크기가 상어 크기 이하
                        if(map[nr][nc]<=baby.size){
                            visited[nr][nc]=true;
                            q.add(new State(nr,nc, cur.size, cur.eat, cur.dist+1));

                            //먹을 수 있는 물고기 조건 : 빈칸이 아니고 상어보다 크기가 작음
                            if(map[nr][nc]>0 && map[nr][nc]<baby.size){
                                candidates.add(new State(nr,nc,cur.size, cur.eat, cur.dist+1));
                            }
                        }
                    }
                }
            }
            //먹을 수 있는 물고기가 없으면 종료
            if(candidates.isEmpty()) break;

            //거리 -> 행-> 열 기준 정렬
            Collections.sort(candidates, (o1, o2) ->{
                if(o1.dist==o2.dist){
                    if(o1.r==o2.r){
                        return Integer.compare(o1.c, o2.c); // 3. 열(c)가 작은 순
                    }
                    return Integer.compare(o1.r,o2.r); //2. 행(r)이 작은 순
                }
                return Integer.compare(o1.dist, o2.dist); //1. 거리가 가까운 순
            });

            //가장 우선순위가 높은 물고기 선택
            State target=candidates.get(0);

            //시간 증가
            totalTime+=target.dist;

            //아기 상어 상태 갱신
            baby.r=target.r;
            baby.c=target.c;
            baby.eat++;

            //크기 증가 조건 체크
            if(baby.eat==baby.size){
                baby.size++;
                baby.eat=0;
            }

            //먹은 물고기 자리는 빈칸으로
            map[baby.r][baby.c]=0;
        }
        System.out.println(totalTime);
    }

    static class State{
        int r,c,size,eat,dist;

        public State(int r, int c, int size, int eat, int dist){
            this.r=r;
            this.c=c;
            this.size=size;
            this.eat=eat;
            this.dist=dist;
        }
    }
}
