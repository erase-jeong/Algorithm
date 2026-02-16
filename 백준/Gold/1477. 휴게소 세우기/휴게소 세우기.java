import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());

        int[] rest=new int[N];

        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            rest[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(rest);  //휴게소 정렬
        //System.out.println(Arrays.toString(rest));

        //int[] gugan=new int[N+1];
        int[] gugan;

        if(N==0){
            gugan=new int[]{K}; //휴게소가 없으면 구간은 0~K 하나뿐
        }else{
            gugan=new int[N+1];
            gugan[0]=rest[0]; //0~첫 번째 휴게소
            for(int i=1;i<N;i++){
                gugan[i]=rest[i]-rest[i-1]; //휴게소 사이
            }
            gugan[N]=K-rest[N-1]; //마지막 휴게소 ~ 끝
        }

        //이분탐색
        //left : 가능한 최소 거리 (1)
        //right : 가능한 최대 거리 (K-1)
        int left=1;
        int right=K-1;
        int ans=0;

        while(left<=right){
            int mid=(left+right)/2; //우리가 가정한 "최대 구간 길이"
            int count=0; //mid 간격으로 맞추려면 추가로 필요한 휴게소 개수

            for(int dist:gugan){
                //현재 구간(dist)을 mid로 나눴을 때 몇 개가 더 필요한지 계산
                count+=(dist-1)/mid;
            }

            if(count>M){
                left=mid+1;
            }else{
                ans=mid;
                right=mid-1;
            }
        }
        System.out.println(ans);

    }
}
