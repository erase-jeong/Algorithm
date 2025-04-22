import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int L=sc.nextInt();

        int[] balls=new int[N];
        int count=0;
        int now=0;

        while(getMax(balls)<M){
            if(balls[now]%2==0){ //실제로는 홀수 번째 받은 경우
                balls[now]++;
                now=(now+L)%N;
            }else{ //실제로는 짝수 번째 받은 경우
                balls[now]++;
                now=(now-L+N)%N; //음수 인덱스 방지
            }
            count++;
        }

        System.out.println(count-1);
        sc.close();

    }

    //최대값 구하는 함수
    private static int getMax(int[] arr){
        int max=arr[0];
        for(int val:arr){
            if(val>max) max=val;
        }
        return max;
    }
}