

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        //시간 환산해서 넣기
        String[] s=st.nextToken().split(":");
        String[] e=st.nextToken().split(":");
        String[] q=st.nextToken().split(":");

        int start=Integer.parseInt(s[0])*60+Integer.parseInt(s[1]);
        int end=Integer.parseInt(e[0])*60+Integer.parseInt(e[1]);
        int quick=Integer.parseInt(q[0])*60+Integer.parseInt(q[1]);

        Set<String> startSet=new HashSet<String>();
        Set<String> endSet=new HashSet<String>();

        while(true){
            String line=br.readLine();
            if(line==null || line.trim().isEmpty()) break; //이게 맞나?

            String[] arr=line.split(" ");

            //시간 변환하기
            String[] timeArr=arr[0].split(":");
            int time=Integer.parseInt(timeArr[0])*60+Integer.parseInt(timeArr[1]);

            /// 입장 체크
            if(time<=start){
                startSet.add(arr[1]);
            }

            /// 퇴장 체크
            if(end<=time && time<=quick){
                endSet.add(arr[1]);
            }

        }

        startSet.retainAll(endSet);
        System.out.println(startSet.size());

    }
}

