import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int heart_x,heart_y;
    static int hurry_end_x,hurry_end_y;
    static int[][] cookie;

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        cookie=new int[n][n];

        for(int i=0;i<n;i++){
            String line=br.readLine();
            for(int j=0;j<n;j++){
                char input=line.charAt(j);
                if(input=='_') cookie[i][j]=0;
                else if(input=='*') cookie[i][j]=1;
            }
        }
        
        StringBuilder sb=new StringBuilder();

        //심장 찾기
        for(int i=1;i<n-1;i++){
            for(int j=1;j<n-1;j++){
                if(cookie[i][j]==1){
                    findHeart(i,j);
                }
            }
        }
        sb.append(heart_x+1).append(" ").append(heart_y+1).append("\n");

        /*
        왼쪽 팔 : 심장으로부터 왼쪽 -> 1나올때까지 (0나오면 종료)
        오른쪽 팔 : 심장으로부터 오른쪽 -> 1나올때까지
        허리 : 심장으로부터 아래 -> 1나올 때까지
        왼쪽 다리 : 허리(x+1,y-1)에서 시작 , 아래로 1나올 때까지
        오른쪽 다리 : 허리(x+1,y+1)에서 시작 , 아래로 1나올 때까지
         */

        //왼쪽 팔
        int size=0;
        for(int y=heart_y-1;y>=0;y--){
            if(cookie[heart_x][y]==1) size++;
            else break;
        }
        sb.append(size).append(" ");

        //오른쪽 팔
        size=0;
        for(int y=heart_y+1;y<n;y++){
            if(cookie[heart_x][y]==1) size++;
            else break;
        }
        sb.append(size).append(" ");

        //허리
        size=0;
        hurry_end_y=heart_y; //가독성
        for(int x=heart_x+1;x<n;x++){
            if(cookie[x][heart_y]==1) {
                size++;
                hurry_end_x=x;
            }
            else break;
        }
        sb.append(size).append(" ");

        //왼쪽 다리
        size=0;
        for(int x=hurry_end_x+1;x<n;x++){
            if(cookie[x][hurry_end_y-1]==1) size++;
            else break;
        }
        sb.append(size).append(" ");

        //오른쪽 다리
        size=0;
        for(int x=hurry_end_x+1;x<n;x++){
            if(cookie[x][hurry_end_y+1]==1) size++;
            else break;
        }
        sb.append(size).append(" ");


        System.out.println(sb);

    }

    public static void findHeart(int r, int c){
        if(cookie[r-1][c]==1 && cookie[r+1][c]==1 && cookie[r][c-1]==1 && cookie[r][c+1]==1){
                heart_x=r;
                heart_y=c;
            }
    }
    
}