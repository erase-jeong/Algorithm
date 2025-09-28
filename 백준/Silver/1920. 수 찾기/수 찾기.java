import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        int[] n_lst=new int[n];

        StringTokenizer st=new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<n;i++){
            n_lst[i]=Integer.parseInt(st.nextToken());
        }
        /*
        for(int x:n_lst){
            System.out.print(x+" ");
        }

         */

        int m=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine(), " ");

        int[] m_lst=new int[m];
        for(int i=0;i<m;i++){
            m_lst[i]=Integer.parseInt(st.nextToken());
        }

        /*

        for(int x:m_lst){
            System.out.print(x+" ");
        }

         */

        int[] answer=new int[m];

        Arrays.sort(n_lst);
        //단순 이중 for문 -> 시간복잡도 걸릴지도

        //이진탐색


        int mid=n_lst[n/2];

        for(int i=0;i<m;i++) {
            //찾는 값이 있다면
            if (binaryS(m_lst[i], n_lst) == 1) {
                answer[i] = 1;
                System.out.println(1);
            } else { //값이 없다면
                answer[i] = 0;
                System.out.println(0);
            }
        }
    }

    public static int binaryS(int num, int[] n_lst){
        int left=0;
        int right=n_lst.length-1;

        while(left<=right){
            int mid=(left+right)/2; // 중간 위치

            if(num<n_lst[mid]){
                right=mid-1;
            }
            else if(num>n_lst[mid]){
                left=mid+1;
            }
            else{
                return 1;
            }
        }
        return -1;
    }
}
