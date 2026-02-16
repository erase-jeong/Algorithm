import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[] arr=new int[N];
        StringTokenizer st=new StringTokenizer(br.readLine());

        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            if(arr[i]>max) max=arr[i];
        }
        int M=Integer.parseInt(br.readLine());

        long left=0;  //이것땜에 틀렸나?  //N->0으로 고침
        long right=max;
        long answer=0;

        while(left<=right){
            long mid=(left+right)/2;
            long sum=0; //int -> long으로 수정
            for(int a: arr){
                //상한선 아래 부분에 대해서 더한다.
                //=>결국 상한선 아래부분에 대해서 구한다.
                if(mid>=a) sum+=a;
                else sum+=mid;
            }

            //이분탐색
            if(sum>M){ //mid(예산)을 작게 만들어줘야함
                right=mid-1;
            }else{  //우리가 구하는 거
                answer=mid;
                left=mid+1;
            }
        }
        System.out.println(answer);
    }
}