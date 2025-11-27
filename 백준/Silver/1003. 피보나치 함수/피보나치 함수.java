import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> zero=new ArrayList<>();
    public static ArrayList<Integer> one=new ArrayList<>();

    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        zero.add(1);
        zero.add(0);
        zero.add(1);

        one.add(0);
        one.add(1);
        one.add(1);

        //zero : [1, 0, 1]
        //one : [0, 1, 1]

        for(int i=0;i<T;i++){
            int n=Integer.parseInt(br.readLine());
            fibo(n);

        }
    }

    public static void fibo(int num){
        int length=zero.size();
        if(num>=length){
            for(int i=length;i<num+1;i++){
                zero.add(zero.get(i-1)+zero.get(i-2));
                one.add(one.get(i-1)+one.get(i-2));
            }
        }
        System.out.println(zero.get(num)+" "+one.get(num));

    }
}

