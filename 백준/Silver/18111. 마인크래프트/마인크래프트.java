import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());

        int[][] map=new int[n][m];
        int minHeight=256;
        int maxHeight=0;

        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
                if(map[i][j]<minHeight) minHeight=map[i][j];
                if(map[i][j]>maxHeight) maxHeight=map[i][j];
            }
        }

        int minTime=Integer.MAX_VALUE;
        int resultHeight=0;

        //0부터 256까지 모든 높이를 시도(입력된 범위 내에서만 돌아도 무방==> why??)
        for(int h=minHeight;h<=maxHeight;h++){
            int time=0;
            long inventory=b; //블록 개수가 커질 수 있으므로 long 권장

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    int diff=map[i][j]-h;

                    if(diff>0){ //현재 칸이 목표보다 높음 -> 제거 (2초)
                        time+=diff*2;
                        inventory+=diff;
                    }else if(diff<0){ //현재 칸이 목표보다 낮음 -> 설치(1초)
                        time+=Math.abs(diff);
                        inventory-=Math.abs(diff);
                    }
                }
            }

            //모든 칸을 돌고 난 후 인벤토리가 0이상이어야 함
            if(inventory>=0){
                //시간이 같으면 높은 높이를 선택해야 하므로<= 조건 사용
                if(time<=minTime){
                    minTime=time;
                    resultHeight=h;
                }
            }
        }
        System.out.println(minTime+" "+resultHeight);
    }
}