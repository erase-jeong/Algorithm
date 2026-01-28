import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] dx={-1,1,0,0};
    static int[] dy={0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        char[][] arr=new char[N][N];

        for(int i=0;i<N;i++){
            //StringTokenizer st=new StringTokenizer(br.readLine());
            String line=br.readLine();
            for(int j=0;j<N;j++){
                arr[i][j]=line.charAt(j);
            }
        }

        int heart_x=-1;
        int heart_y=-1;

        for(int i=1;i<N-1;i++){  //심장이 *에 둘러싸여있으려면 맨 끝쪽은 안된다
            for(int j=1;j<N-1;j++){
                if(arr[i][j]=='*'){
                    if(arr[i+1][j]=='*' && arr[i][j+1]=='*'
                            && arr[i-1][j]=='*' && arr[i][j-1]=='*'){
                        heart_x=i;
                        heart_y=j;
                        break;
                    }
                }

            }
        }

        //System.out.println("heart_x : "+heart_x+", heart_y : "+heart_y);
        //System.out.println(heart_x+1+" "+heart_y+1); //진짜로 꼭 확인하기
        //System.out.println((heart_x+1)+" "+(heart_y+1));

        //System.out.println(Arrays.deepToString(arr));

        /*
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        */

        int left_arm_x=-999;
        int left_arm_y=-999;
        int left_arm_size=0;

        int right_arm_x=-999;
        int right_arm_y=-999;
        int right_arm_size=0;

        int hurry_x=-999;
        int hurry_y=-999;
        int hurry_size=0;

        int left_leg_x=-999;
        int left_leg_y=-999;
        int left_leg_size=0;

        int right_leg_x=-999;
        int right_leg_y=-999;
        int right_leg_size=0;

        //왼쪽 팔  : 심장기준 왼쪽으로
        //heart_x, heart_y
        int start=heart_y;
        while(true){
            //-1이 아닐때까지 빼기
            --start;
            if(start<0) break;

            if(arr[heart_x][start]=='*'){
                left_arm_size+=1;
            }else{
                break;
            }
        }

        //System.out.println("왼쪽 팔 길이");
        //System.out.println(left_arm_size);



        //오른쪽 팔 : 심장기준 오른쪽으로
        //heart_x, heart_y
        start=heart_y;
        while(true){
            ++start;
            if(start>N-1) break;
            if(arr[heart_x][start]=='*'){
                right_arm_size+=1;
            }else{
                break;
            }
        }

        //System.out.println("오른쪽 팔 길이");
        //System.out.println(right_arm_size);


        //허리 : 심장기준 밑으로 (공백나올 때까지)
        start=heart_x;
        while(true){
            ++start;
            if(start>N-1) break;
            if(arr[start][heart_y]=='*'){
                hurry_size+=1;
                hurry_x=start;
            }else{
                break;
            }
        }




        //왼쪽 다리 : 허리끝 대각선 아래(왼쪽)부터
        int start_x=hurry_x;
        int start_y=heart_y-1;
        while (true){
            ++start_x;
            if(start_x>N-1) break;
            if(arr[start_x][start_y]=='*'){
                left_leg_size+=1;
            }else{
                break;
            }
        }



        //오른쪽 다리 : 허리끝 대각선 아래(오른쪽)부터
        start_x=hurry_x;
        start_y=heart_y+1;
        while (true){
            ++start_x;
            if(start_x>N-1) break;
            if(arr[start_x][start_y]=='*'){
                right_leg_size+=1;
            }else{
                break;
            }
        }


        //start_x=hurry_x+1;
        //start_y=hurry_y-1;


        //최종출력
        //System.out.println("--- 최종출력 ---");
        System.out.println((heart_x+1)+" "+(heart_y+1));
        System.out.println(left_arm_size+" "+right_arm_size+" "+hurry_size+" "+left_leg_size+" "+right_leg_size);

    }
}
