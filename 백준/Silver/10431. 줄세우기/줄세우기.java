import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            List<Integer> lst=new ArrayList<>();

            int cnt=0;
            int number=0;
            for(int j=0;j<21;j++){
                if(j==0){
                    number=Integer.parseInt(st.nextToken());
                }
                else {
                    int value=Integer.parseInt(st.nextToken());
                    int end=lst.size();
                    lst.add(value);
                    Collections.sort(lst);
                    int index=lst.indexOf(value);
                    cnt+=(end-index);
                }
            }
            System.out.println(number+" "+cnt);
        }

    }
}