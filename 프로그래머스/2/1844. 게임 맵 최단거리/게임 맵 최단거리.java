import java.util.*;

class Solution{
    int[] dx={-1,1,0,0}; //static으로 안해도 괜찮? why?
    int[] dy={0,0,-1,1};
    
    public int solution(int[][] maps){
        int n=maps.length;
        int m=maps[0].length;
        
        boolean[][] visited=new boolean[n][m];
        return bfs(maps, visited, n, m);
    }
    
    public int bfs(int[][] maps, boolean[][] visited, int n, int m){
        Queue<int[]> queue=new LinkedList<>();
        
        queue.add(new int[]{0,0,1});
        visited[0][0]=true;
        
        while(!queue.isEmpty()){
            int[] current=queue.poll();
            int x=current[0];
            int y=current[1];
            int cnt=current[2];
            
            if(x==n-1 && y==m-1){
                return cnt;
            }
            
            for(int d=0;d<4;d++){
                int nx=x+dx[d];
                int ny=y+dy[d];
                
                if(0<=nx && nx<=n-1 && 0<=ny && ny<=m-1 
                   && maps[nx][ny]==1 && !visited[nx][ny]){
                    visited[nx][ny]=true;
                    queue.add(new int[]{nx,ny,cnt+1});
                    //count++;
                } 
            }
        }
        return -1;     
    }
}

