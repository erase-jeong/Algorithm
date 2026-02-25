import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        List<String> options=new ArrayList<>();

        for(int i=0;i<N;i++){
            options.add(br.readLine());
        }

        //System.out.println(options);

        HashMap<Character,Integer> map=new HashMap<>();

        //5개이하의 단어 , 1단어 = 10개이하 알파벳 => 공백포함 최대 55번? 54번?

        for(int i=0;i<N;i++){
            String option=options.get(i);
            //String[] words=o.split(" ");
            //이거말고 각 단어의 첫번째 인덱스를 배열에 저장해두는게 더 편할꺼같은데?
            ArrayList<Integer> wordStartIndex=new ArrayList<>();
            //System.out.println("option : "+option);

            for(int j=0;j<option.length();j++){
                if(option.charAt(j)==' '){ //공백은 단어의 시작이 될 수 없으므로 패스
                    continue;
                }
                //첫 번째 글자이거나, 바로 앞 글자가 공백인 경우 단어의 시작점
                if(j==0 || option.charAt(j-1)==' '){
                    wordStartIndex.add(j);
                }
            }
            //System.out.println("wordStartIndex : "+wordStartIndex);

            int targetIdx=-1; //단축키로 지정된 인덱스를 저장할 변수. -1이면 아직 못 찾았다는 뜻
            int idx=wordStartIndex.get(0);
            for(int kk=0;kk<wordStartIndex.size();kk++){
                int realIdx=wordStartIndex.get(kk);
                char c=option.charAt(realIdx);
                char upperC=Character.toUpperCase(c); //대소문자 구분을 없애기 위해 대문자로 변환

                //맵에 대문자로 변환한 글자가 없다면 단축키로 지정 가능
                if(!map.containsKey(upperC)){  //없다면 넣는거니깐 이미 있다면 if문 작동안하고 for반복문으로 돈다.
                    map.put(upperC,realIdx);
                    targetIdx=realIdx;
                    break;
                }
            }

            if(targetIdx==-1){
                for(int k=0;k<option.length();k++){  
                    //1. 만약 option.charAt(k)가 공백(' ')이라면 건너뛰기 (continue)
                    if(option.charAt(k)==' ') continue;
                    //2. 공백이 아니라면 대문자로 변환하기
                    char c=option.charAt(k);
                    char upperC=Character.toUpperCase(c);

                    //3. 맵에 그 대문자가 없다면 단축키로 지정 가능!
                    if(!map.containsKey(upperC)){
                        map.put(upperC,k);
                        targetIdx=k;
                        break;
                    }
                       
                }
            }
 
            for(int k=0;k<option.length();k++){
                if(k==targetIdx){
                    System.out.print("["+option.charAt(k)+"]");
                }else{
                    System.out.print(option.charAt(k));
                }
            }
            System.out.println();
        }

    }
}