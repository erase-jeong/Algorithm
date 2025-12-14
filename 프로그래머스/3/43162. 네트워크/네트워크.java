class Solution {
    static boolean[] check;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        check = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(!check[i]){
                dfs(computers, i);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dfs(int[][] computers, int i){
        check[i] = true;
        
        for(int j=0;j<computers.length;j++){
            if(i != j && computers[i][j] == 1 && !check[j]){
                dfs(computers, j);
            }
        }
    }
}