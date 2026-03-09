import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        for(int tc=0;tc<T;tc++) {
            int[] start = new int[2];
            int[] end = new int[2];
            int[] circle = new int[3];

            StringTokenizer st = new StringTokenizer(br.readLine());
            start[0] = Integer.parseInt(st.nextToken());
            start[1] = Integer.parseInt(st.nextToken());
            end[0] = Integer.parseInt(st.nextToken());
            end[1] = Integer.parseInt(st.nextToken());

            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                boolean start_f = false;
                boolean end_f = false;
                st = new StringTokenizer(br.readLine());
                circle[0] = Integer.parseInt(st.nextToken());
                circle[1] = Integer.parseInt(st.nextToken());
                circle[2] = Integer.parseInt(st.nextToken());

                if ((Math.pow(circle[0] - start[0], 2) + Math.pow(circle[1] - start[1], 2)) <= Math.pow(circle[2], 2)) {
                    start_f = true;
                    cnt++;
                }

                if ((Math.pow(circle[0] - end[0], 2) + Math.pow(circle[1] - end[1], 2)) <= Math.pow(circle[2], 2)) {
                    end_f = true;
                    cnt++;
                }

                if (start_f && end_f) {
                    cnt -= 2;
                }
            }
            System.out.println(cnt);
        }
    }
}
