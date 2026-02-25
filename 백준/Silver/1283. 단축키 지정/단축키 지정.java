import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        List<String> options=new ArrayList<>();
        for(int i=0;i<N;i++){
            options.add(br.readLine());
        }

        //존재 여부만 확인하므로 HashMap 대신 HashSet 사용
        HashSet<Character> usedKeys=new HashSet<>();

        //출력을 한 번에 모아서 하기 위한 StringBuilder
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<N;i++){
            String option=options.get(i);
            ArrayList<Integer> wordStartIndex=new ArrayList<>();

            //단어의 시작 인덱스 찾기
            for(int j=0;j<option.length();j++){
                if(option.charAt(j)==' '){
                    continue;
                }
                if(j==0 || option.charAt(j-1)==' '){
                    wordStartIndex.add(j);
                }
            }

            int targetIdx=-1;

            //1단계 : 각 단어의 첫 글자 확인
            for(int j=0;j<wordStartIndex.size();j++){
                int realIdx=wordStartIndex.get(j);
                char upperC=Character.toUpperCase(option.charAt(realIdx));

                if(!usedKeys.contains(upperC)){
                    usedKeys.add(upperC);
                    targetIdx=realIdx;
                    break;
                }
            }

            //2단계 : 첫 글자에서 못 찾았다면, 왼쪽부터 차례대로 남은 알파벳 검사
            if(targetIdx==-1){
                for(int j=0;j<option.length();j++){
                    if(option.charAt(j)==' ') continue;

                    char upperC=Character.toUpperCase(option.charAt(j));

                    if(!usedKeys.contains(upperC)){
                        usedKeys.add(upperC);
                        targetIdx=j;
                        break;
                    }
                }

            }

            //3단계 : 출력 문자열 만들기 (StringBuilder에 쌓기)
            for(int j=0;j<option.length();j++){
                if(j==targetIdx){
                    sb.append("[").append(option.charAt(j)).append("]");
                }else{
                    sb.append(option.charAt(j));
                }
            }
            sb.append("\n");
        }

        //모아둔 결과물 한 번에 출력
        System.out.println(sb.toString());
    }
}
