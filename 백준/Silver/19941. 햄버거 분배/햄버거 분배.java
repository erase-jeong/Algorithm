import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        char[] table = new char[N];
        //st=new StringTokenizer(br.readLine(),"");
        String line = br.readLine();
        for (int i = 0; i < N; i++) {
            table[i] = line.charAt(i);
        }

        int cnt=0;

        //알고리즘
        for(int i=0;i<N;i++){
            if(table[i]=='P'){  //사람이라면?

                for(int j=i-K; j<i+K+1; j++){   // i-K ~ i+K+1 (-1)
                    if(j<0 || j>N-1) continue;
                    if(table[j]=='H') {
                        table[j]='-';
                        cnt++;
                        break;
                    }
                }

            }

        }
        System.out.println(cnt);
    }
}