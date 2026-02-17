import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int L=Integer.parseInt(st.nextToken());
        int[] arr=new int[n+1];
        st=new StringTokenizer(br.readLine());
        for(int i=1;i<n+1;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Deque<Integer> dq=new ArrayDeque<>(); //인덱스 저장
        StringBuilder sb=new StringBuilder();

        for(int i=1;i<=n;i++){
            int left=i-L+1; //윈도우 왼쪽 경계

            //1) 범위 밖 제거
            while(!dq.isEmpty() && dq.peekFirst()<left){
                dq.pollFirst();
            }

            //2) 뒤에서부터 현재 값보다 큰 애들 제거(단조 증가 유지)
            while(!dq.isEmpty() && arr[dq.peekLast()]>arr[i]){
                dq.pollLast();
            }

            //3) 현재 인덱스 추가
            dq.addLast(i);

            //4) 최소 출력
            sb.append(arr[dq.peekFirst()]).append(' ');
        }

        System.out.println(sb.toString());
    }
}
