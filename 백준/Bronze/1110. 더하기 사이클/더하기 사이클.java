import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int num=n;
        int count=0;

        do{
            int a=num/10; //10의 자리
            int b=num%10; //1의 자리
            int c=(a+b)%10; //합의 1의 자리
            num=b*10+c;
            count++;
        }while(num!=n);

        System.out.println(count);
    }
}

/*
[do - while ] 쓴 이유
- 반드시 한 번은 사이클 계산을 하고 넘어가야 한다.


 */