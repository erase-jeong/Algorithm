class Solution {
    public int solution(int[][] sizes) {
        int max_v=0;
        int max_h=0;
        
        //가로,세로 큰거작은거 위치 바꾸기
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][1]>sizes[i][0]){
                int tmp=sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=tmp;
            }
        }
        
        for(int i=0;i<sizes.length;i++){
            
            //가로에서 max찾기
            if(sizes[i][0]>max_v){
                max_v=sizes[i][0];
            }
            
            //세로에서 max찾기
            if(sizes[i][1]>max_h){
                max_h=sizes[i][1];
            }
        }
        
        return max_h*max_v;
    }
}