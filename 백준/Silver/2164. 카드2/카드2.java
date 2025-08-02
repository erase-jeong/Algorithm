import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); // 정수 N

        Queue<Integer> queue=new LinkedList<>();
        //반복문 돌면서 N 넣기
        for(int i=0;i<N;i++){
            queue.offer(i+1);
        }

        while(queue.size()>1){
            queue.poll(); //버리기
            queue.offer(queue.poll()); //하나 뒤로
        }
        System.out.println(queue.poll()); //마지막 카드
        

    }

}
