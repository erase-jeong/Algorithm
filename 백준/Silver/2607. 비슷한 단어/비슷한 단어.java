import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        int answer=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String word=br.readLine();

        int firstLength=word.length();
        int[] firstWord=new int[26];

        for(int i=0;i<word.length();i++){
            firstWord[word.charAt(i)-'A']++;
        }

        for(int i=1;i<N;i++){
            word=br.readLine();
            int matchCount=0;

            int[] compareWord=firstWord.clone();

            for(int j=0;j<word.length();j++){
                int charIdx=word.charAt(j)-'A';
                if(compareWord[charIdx]>0){
                    matchCount++;
                    compareWord[charIdx]--;
                }
            }


            if(word.length()==firstLength){
                //1) 완전히 같다 -> matchCount가 원본 단어의 길이와 같다
                if(matchCount==firstLength) answer++;
                else if(matchCount==firstLength-1) answer++;
                //2) 한 문자만 다르다 -> matchCount가 원본 단어의 길이보다 1작다
                // (ex. GOD vs GOOD 은 길이는 다르지만, ABC vs ABD는 길이는 같고 2개만 일치)

            }else if(word.length()+1==firstLength){
                if(matchCount==word.length()) answer++;
                //1) 구성은 같되, 길이가 다르다 (한문자 중복)
                //2) 구성이 다른 글자 하나가 있다
            }else if(word.length()-1==firstLength){
                if(matchCount==firstLength) answer++;
                //1) 구성은 같고, 길이만 다르다
                //2) 구성이 다른 애 하나가 있다
            }
        }
        System.out.println(answer);

    }
}