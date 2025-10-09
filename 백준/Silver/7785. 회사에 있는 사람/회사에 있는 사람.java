import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        HashMap<String,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            String name=String.valueOf(st.nextToken());
            String log=String.valueOf(st.nextToken());

            if(log.equals("enter")){
                map.put(name,1);
            }
            else if(log.equals("leave")){
                map.put(name,map.get(name)+1);
            }

            //map.computeIfAbsent(name,k->0);
            //map.put(name,map.get(name)+1);
            //System.out.println("name :"+name+", log : "+log);
        }
        List<String > lst=new ArrayList<>();

        for(String e:map.keySet()){
            if(map.get(e)==1) lst.add(e);
        }

        Collections.sort(lst,Collections.reverseOrder());
        
        for(String s:lst){
            System.out.println(s);
        }
        //System.out.println(lst);
    }
}