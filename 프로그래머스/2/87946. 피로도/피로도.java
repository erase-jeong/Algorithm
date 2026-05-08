import java.util.*;

class Solution {
    static boolean[] visited;
    static HashSet<Integer> set;
    static int n;
    
    public int solution(int k, int[][] dungeons) {
        n=dungeons.length;
        visited=new boolean[n];
        set=new HashSet<>();
        
        //int answer = -1;
        
        dfs(0,k,0,dungeons);
        System.out.println("set : "+set);
        int answer=Collections.max(set);
        return answer;
    }
    
    static void dfs(int depth,int energy, int count, int[][] dungeons){
        
    
        
        for(int i=0;i<n;i++){
            if(visited[i]) continue;
            
            int[] dg=dungeons[i];
            int need=dg[0];
            int tired=dg[1];
            
            if(energy>=need){
                visited[i]=true;
                dfs(depth+1,energy-tired,count+1,dungeons);
                visited[i]=false;
            }
        }
        set.add(count);
    }    
}