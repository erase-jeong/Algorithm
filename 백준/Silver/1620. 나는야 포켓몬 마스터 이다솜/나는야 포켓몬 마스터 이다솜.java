import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        HashMap<String,Integer> map1=new HashMap<>();
        HashMap<Integer,String> map2=new HashMap<>();

        //입력받기
        for(int i=1;i<=N;i++){
            String pocketmon=br.readLine();
            map1.put(pocketmon,i);
            map2.put(i,pocketmon);
        }

        //출력하기
        for(int i=0;i<M;i++){
            String line=br.readLine();

            try{
                int findNum=Integer.parseInt(line); //정수 변환 시도
                System.out.println(map2.get(findNum));
            }catch(NumberFormatException e){
                System.out.println(map1.get(line));
            }
        }
    }
}
