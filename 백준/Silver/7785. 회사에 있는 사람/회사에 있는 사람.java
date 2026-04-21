import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        TreeMap<String, Integer> map=new TreeMap<>();
        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            String name=st.nextToken();
            String log=st.nextToken();

            if(log.equals("enter")){
                map.put(name,1);
            }else if(log.equals("leave")){
                map.remove(name);
            }
        }

        for(String key:map.descendingKeySet()){
            System.out.println(key);
        }

    }
}