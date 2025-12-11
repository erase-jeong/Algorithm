import java.util.*;
import java.io.*;

public class Main {

    public static int N;
    public static int[] arr;
    public static int maxVal;
    public static int minVal;


    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        arr=new int[N];
        StringTokenizer st=new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        int[] oper=new int[4];

        st=new StringTokenizer(br.readLine());

        for(int i=0;i<4;i++){
            oper[i]=Integer.parseInt(st.nextToken());
        }

        maxVal=Integer.MIN_VALUE;
        minVal=Integer.MAX_VALUE;

        dfs(1, arr[0], oper[0], oper[1],oper[2],oper[3]);

        System.out.println(maxVal);
        System.out.println(minVal);
    }

    public static void dfs(int idx, int result, int plus, int minus, int mul, int div){

        //종료조건
        if(idx==N){
            maxVal=Math.max(maxVal,result);
            minVal=Math.min(minVal,result);
            return;

        }

        int nextNum=arr[idx];

        if(plus>0){
            dfs(idx+1, result+nextNum, plus-1, minus, mul, div);
        }

        if(minus>0){
            dfs(idx+1, result-nextNum, plus, minus-1, mul, div);
        }

        if(mul>0){
            dfs(idx+1,result*nextNum, plus, minus, mul-1, div);
        }

        if(div>0){

            int temp;
            if(nextNum>0){
                temp=result/nextNum;
            }else{
                temp=-(Math.abs(result)/nextNum);
            }
            dfs(idx+1, temp, plus, minus, mul, div-1);

        }

    }
}