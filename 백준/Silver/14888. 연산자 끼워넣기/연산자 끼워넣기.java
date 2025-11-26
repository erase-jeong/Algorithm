import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static int N;
    public static int maxVal;
    public static int minVal;

    public static int[] arr;

    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        arr=new int[N];

        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        int[] oper=new int[4]; // + - * %
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<4;i++){
            oper[i]=Integer.parseInt(st.nextToken());
        }

        maxVal=Integer.MIN_VALUE;
        minVal=Integer.MAX_VALUE;

        dfs(1,arr[0],oper[0], oper[1], oper[2], oper[3]);
        

        System.out.println(maxVal);
        System.out.println(minVal);

    }

    public static void dfs(int idx, int cur, int plus, int minus, int mul, int div){
        //idx : 지금 몇번째 숫자를 사용할 차례인지 (0-based)
        //cur : 지금까지 계산된 값

        if(idx==N){ //숫자를 전부 다 썼으면
            maxVal=Math.max(maxVal, cur);
            minVal=Math.min(minVal, cur);
            return;
        }

        int nextNum=arr[idx];

        //1)더하기
        if(plus>0) dfs(idx+1,cur+nextNum, plus-1, minus, mul, div);

        //2)빼기
        if(minus>0) dfs(idx+1, cur-nextNum,plus, minus-1, mul, div);

        //3)곱하기
        if(mul>0) dfs(idx+1, cur*nextNum, plus, minus, mul-1, div);

        //4)나누기
        if(div>0){
            int temp;
            if(cur<0){
                temp=-(Math.abs(cur)/nextNum);
            }else{
                temp=cur/nextNum;
            }
            dfs(idx+1, temp, plus, minus, mul, div-1);
        }

    }


}