import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            String command;
            int x;
            if(st.countTokens()==1){
                command=st.nextToken();
                //size
                //empty
                //front
                //back
                if(command.equals("pop_front")){
                    if(!dq.isEmpty()) System.out.println(dq.removeFirst());
                    else System.out.println(-1);

                }else if(command.equals("pop_back")){
                    if(!dq.isEmpty()) System.out.println(dq.removeLast());
                    else System.out.println(-1);

                }else if(command.equals("size")){
                    System.out.println(dq.size());

                }else if(command.equals("empty")){
                    if(dq.isEmpty()) System.out.println(1);
                    else System.out.println(0);

                }else if(command.equals("front")){
                    if(!dq.isEmpty()) System.out.println(dq.getFirst());
                    else System.out.println(-1);

                }else if(command.equals("back")){
                    if(!dq.isEmpty()) System.out.println(dq.getLast());
                    else System.out.println(-1);
                }


            }else{
                command=st.nextToken();
                x=Integer.parseInt(st.nextToken()); //없을수도 있음
                if(command.equals("push_front")){
                    dq.addFirst(x);
                }else if(command.equals("push_back")){
                    dq.addLast(x);
                }
            }
        }
    }
}
