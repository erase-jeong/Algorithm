import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static int[] dots;

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());  //점의 개수
        m=Integer.parseInt(st.nextToken());  //선분의 개수

        dots=new int[n];
        //점 입력받기
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            dots[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(dots);

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int start=Integer.parseInt(st.nextToken());
            int end=Integer.parseInt(st.nextToken());

            if(end<=dots[0] || start>=dots[n-1]){
                sb.append(0).append("\n");
                continue;
            }
            int s=findStart(start);  //선분에 포함되는 시작 점 찾기
            int e=findEnd(end); //선분에 포함되는 마지막 점 찾기

            sb.append(e-s+1).append("\n");
        }
        System.out.println(sb);

    }

    public static int findStart(int dot){
        int start=0, end=n-1;
        int idx=0;
        while(start<=end){
            int mid=(start+end)/2;
            if(dots[mid]>=dot){
                idx=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return idx;
    }

    public static int findEnd(int dot){
        int start=0, end=n-1;
        int idx=0;
        while(start<=end){
            int mid=(start+end)/2;
            if(dots[mid]<=dot){
                idx=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return idx;
    }
}
