import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            //공백 출력
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            //별 출력
            for(int k=0;k<(2*N-1)-(2*i);k++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}