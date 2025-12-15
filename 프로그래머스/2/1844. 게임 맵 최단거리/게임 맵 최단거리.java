import java.util.*;

class Solution{
    
    public int solution(int[][] maps){
        int n=maps.length;
        int m=maps[0].length;
        
        int[] dx={-1,1,0,0};
        int[] dy={0,0,-1,1};
        
        Queue<int []> queue=new LinkedList<>();
        boolean[][] visited=new boolean[n][m];
        
        
        queue.add(new int[]{0,0,1});
        
        while(!queue.isEmpty()){
            int[] p=queue.poll();
            int x=p[0];
            int y=p[1];
            int cnt=p[2];
            //visited[x][y]=true;  //(1)
            
            if(x==n-1 && y==m-1){
                return cnt;
            }
            
            for(int i=0;i<4;i++){
                int nx=x+dx[i];
                int ny=y+dy[i];
                
                if(nx>=0 && ny>=0 && nx<n && ny<m && maps[nx][ny]==1 && !visited[nx][ny]){
                    visited[nx][ny]=true;  //같은 값 다시 큐에 넣지 않기 위해서 
                    queue.add(new int[]{nx,ny,cnt+1});
                }
                
            }
            
        }
        return -1;
    }
    
}