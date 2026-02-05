import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] light=new int[n+1];  //0번 인덱스 무시

        for(int i=1;i<n+1;i++){
            light[i]=Integer.parseInt(st.nextToken());
        }

        int m=Integer.parseInt(br.readLine());
        int[][] student=new int[m][2];
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            student[i][0]=Integer.parseInt(st.nextToken());
            student[i][1]=Integer.parseInt(st.nextToken());  //0번 인덱스와 맞춰주기 위해서
        }

        for(int i=0;i<m;i++){
            if(student[i][0]==1){  //남자라면
                //스위치번호가 자신이 받은 수의 배수라면
                for(int j=1;j<n+1;j++){
                    if(j%student[i][1]==0){
                        if(light[j]==1) light[j]=0;
                        else light[j]=1;
                    }
                }



            }else{ //여자라면  //원래는 한번에 싹다 바꿔야 하는ㄷ
                //자기자신보다 양쪽으로 -1, +1 씩 범위넓혀가기
                int num=student[i][1];
                int left=num;
                int right=num;

                //대칭이면 범위 확장
                while(left-1>=1 && right+1<=n && light[left-1]==light[right+1]){
                    left--; right++;
                }

                //범위 <-> 변경
                for(int j=left;j<=right;j++){
                    if(light[j]==1) light[j]=0;
                    else light[j]=1;

                }

            }


        }


        for(int i=1;i<n+1;i++){
            System.out.print(light[i]+" ");
            if(i%20==0) System.out.println();
        }

    }
}
