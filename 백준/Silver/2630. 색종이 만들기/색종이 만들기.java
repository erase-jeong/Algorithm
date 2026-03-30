import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;
    static int zeroCnt;
    static int oneCnt;

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        map=new int[N][N];

        zeroCnt=0;
        oneCnt=0;

        int zero=0;
        int one=0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st=new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++){
                map[i][j]=Integer.parseInt(st.nextToken());
                //zero==0
                //사실은 이때부터 zero, one 개수 세야만 함.
            }
        }

        solve(0,0,N);

        System.out.println(zeroCnt);
        System.out.println(oneCnt);
    }

    //영역 검사 함수
    static public boolean isSameColor(int r,int c, int size){
        int zero=0;
        int one=0;

        for(int i=r;i<r+size;i++){
            for(int j=c;j<c+size;j++){
                if(map[i][j]==0) zero++;
                else if(map[i][j]==1) one++;
            }
        }

        if(zero==size*size){
            zeroCnt++;
            return true;
        }
        else if(one==size*size){
            oneCnt++;
            return true;
        }else{
            return false;
        }
    }

    //분할 정복 함수
    static public void solve(int r, int c, int size){
        if(!isSameColor(r,c,size)){
            //size를 절반으로 줄여서 4번의 solve 호출
            int s=size/2; //size의 절반
            solve(r,c,s);
            solve(r,c+s,s);
            solve(r+s,c,s);
            solve(r+s,c+s,s);
        }
    }
}