import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        String[] nLst=new String[N];
        String[] mLst=new String[M];

        //N개의 줄
        for(int i=0;i<N;i++){
            //String line=br.readLine();
            nLst[i]=br.readLine();
        }
        

        int cnt=0;

        //M개의 줄
        for(int i=0;i<M;i++){
            String line=br.readLine();
            for(int j=0;j<N;j++){
                if(nLst[j].equals(line)){
                //if(nLst[j].contains(line)){
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}