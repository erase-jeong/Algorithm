import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        HashMap<Integer,String> map=new HashMap<>();
        HashMap<String,Integer> reverseMap=new HashMap<>();

        for(int i=1;i<=N;i++){
            String name=br.readLine();
            map.put(i,name);
            reverseMap.put(name,i);
        }


        for(int i=0;i<M;i++){
            String find=br.readLine();
            try{
                int findNum=Integer.parseInt(find); //정수 변환 시도
                System.out.println(map.get(findNum));
            }
            catch(NumberFormatException e){
                System.out.println(reverseMap.get(find));
            }

        }

    }
}
