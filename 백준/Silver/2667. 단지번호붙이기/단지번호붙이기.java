import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] dx={0,0,-1,1};
    static int[] dy={-1,1,0,0};

    static int[][] map;
    static boolean[][] visited;

    static int n;

    static int group;

    public static void main(String args[]) throws Exception{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());

        map=new int[n][n];
        visited=new boolean[n][n];

        for(int i=0;i<n;i++){
            String line=br.readLine();
            for(int j=0;j<n;j++){
                map[i][j]=line.charAt(j)-'0'; //문자 -> 숫자로 변환
            }
        }

        List<Integer> lst=new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(map[i][j]==1 && visited[i][j]==false){
                    lst.add(bfs(i,j));
                    group+=1;
                }

            }
        }

        Collections.sort(lst); //오름차순 정렬 필수
        System.out.println(lst.size());
        for(int i=0;i<lst.size();i++){
            System.out.println(lst.get(i));
        }

    }

    static int bfs(int x,int y){
        Queue<int []> q=new LinkedList<>();
        q.add(new int[]{x,y});
        visited[x][y]=true;

        int count=1;
        while(!q.isEmpty()){
            int[] cur=q.poll();
            int cx=cur[0];
            int cy=cur[1];

            for(int i=0;i<4;i++){
                int nx=cx+dx[i];
                int ny=cy+dy[i];

                if(nx>=0 && ny>=0 && nx<n && ny<n){
                    if(!visited[nx][ny]&&map[nx][ny]==1){
                        visited[nx][ny]=true;
                        q.add(new int[]{nx,ny});
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
