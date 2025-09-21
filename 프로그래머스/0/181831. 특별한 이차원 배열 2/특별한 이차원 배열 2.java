class Solution {
    public int solution(int[][] arr) {
        //int answer = 0;
        //return answer;
        
        int cnt=0;
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==arr[j][i]){
                    cnt+=1;
                }
            }
        }
        
        System.out.println(cnt);
        
        if(cnt==arr.length*arr.length){
            return 1;
        }else{
            return 0;
        }
        
        
    }
}

/*
전치행렬한거랑 그냥 행렬이랑 같은거
*/