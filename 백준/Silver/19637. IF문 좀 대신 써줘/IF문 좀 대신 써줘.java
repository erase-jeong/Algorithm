import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://velog.io/@99mon/BOJ-19637-IF%EB%AC%B8-%EC%A2%80-%EB%8C%80%EC%8B%A0-%EC%8D%A8%EC%A4%98 
public class Main{
    static int N,M;
    static String[] names; //창호의 이름
    static int[] powers; //전투력
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        names=new String[N];
        powers=new int[N];

        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine(), " ");
            names[i]=st.nextToken();
            powers[i]=Integer.parseInt(st.nextToken());
        }

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<M;i++){
            int power=Integer.parseInt(br.readLine()); //캐릭터의 전투력
            sb.append(biSearch(power)).append("\n");
        }
        System.out.println(sb);
    }

    public static String biSearch(int power){  //전투력에 해당하는 창호 찾기
        int start=0, end=N-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(powers[mid]>=power){  //현재 캐릭터의 전투력이 해당 창호의 전투력 상한값보다 작거나 같은 경우
                end=mid-1; //왼쪽으로 범위를 좁혀야 함
            }else{ //현재 캐릭터의 전투력이 해당 창호의 전투력 상한값보다 큰 경우
                start=mid+1;  //오른쪽으로 범위를 좁혀야 함
            }
        }
        return names[start]; //또는 names[end+1]

    }
}