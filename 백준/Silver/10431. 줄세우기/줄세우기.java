import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        for(int tc=1;tc<=N;tc++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int num=Integer.parseInt(st.nextToken());

            //int[] arr=new int[20];
            ArrayList<Integer> lst=new ArrayList<>();

            int cnt=0;

            for(int i=0;i<20;i++){
                int student=Integer.parseInt(st.nextToken());
                boolean inserted=false;

                //현재 줄(lst)을 처음부터 확인하며 나보다 큰 학생 찾기
                for(int j=0;j<lst.size();j++){
                    if(lst.get(j)>student){
                        //나보다 큰 학생을 찾음! 그 자리에 끼어들기
                        cnt+=(lst.size()-j); //내 뒤에 있는 사람 수만큼 걸음 수 추가
                        lst.add(j,student);
                        inserted=true;
                        break; //자리를 찾았으니 다음 학생으로
                    }
                }

                //만약 나보다 큰 학생이 한 명도 없었다면? 맨 뒤에 서기
                if(!inserted){
                    lst.add(student);
                }


            }
            System.out.println(num+" "+cnt);

        }
    }
}