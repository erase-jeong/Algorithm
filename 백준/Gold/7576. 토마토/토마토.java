import java.util.*;
import java.io.*;

public class Main {

    static int[] dr={-1,1,0,0};
    static int[] dc={0,0,-1,1};

    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int M=Integer.parseInt(st.nextToken()); //열
        int N=Integer.parseInt(st.nextToken()); //행

        int[][] box=new int[N][M];

        Queue<int[]> q=new LinkedList<>();

        boolean hasZero=false; //안 익은 토마토가 하나라도 있었는지

        //입력
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                box[i][j]=Integer.parseInt(st.nextToken());
                if(box[i][j]==1){
                    //처음부터 익어있는 토마토 : day=0
                    q.offer(new int[]{i,j,0});
                }else if(box[i][j]==0){
                    hasZero=true;
                }
            }
        }

        //처음부터 모든 토마토가 익어 있으면 0일
        if(!hasZero){
            System.out.println(0);
            return;
        }

        int answer=0;

        //BFS
        while(!q.isEmpty()){
            int[] cur=q.poll();
            int r=cur[0];
            int c=cur[1];
            int day=cur[2];

            //현재까지의 최대 날짜 갱신
            if(day>answer) answer=day;

            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                int nday=day+1;

                
                //범위 체크
                if(nr<0 || nr>=N || nc<0 || nc>=M) continue;

                //안 익은 토마토(0)인 경우만 방문
                if(box[nr][nc]==0){
                    box[nr][nc]=1;
                    q.offer(new int[]{nr,nc,nday});
                }
            }
        }

        //BFS가 끝난 뒤에도 안 익은 토마토가 남아 있으면 -1
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(box[i][j]==0){
                    System.out.println(-1);
                    return;
                }
            }
        }

        //모두 익었다면 걸린 날짜 출력
        System.out.println(answer);

    }
}