import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        //1.행개수, 열개수 파악하기
        int row=arr.length;
        int col=arr[0].length;
        
        /*
        int n=0;
        if(row>col) n=row;
        else n=col;
        */
        
        int n=row>col?row:col;
        
        int[][] answer=new int[n][n];
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                answer[i][j]=arr[i][j];
            }
        }
        
        return answer;
    }
}