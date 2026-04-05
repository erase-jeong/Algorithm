import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String firstWord = br.readLine();

        int[] firstCount = getFrequency(firstWord);
        int result = 0;

        for (int i = 0; i < N - 1; i++) {
            String targetWord=br.readLine();
            int[] targetCount=getFrequency(targetWord);

            int sameCount=0; //공통된 알파벳의 총 개수
            for(int j=0;j<26;j++){
                //두 단어 중 더 적게 가진 쪽의 개수를 더함(교집합 개념)
                sameCount+=Math.min(firstCount[j],targetCount[j]);
            }

            //비료 로직
            //1. 두 단어의 길이가 같을 때
            if(firstWord.length()==targetWord.length()){
                if(firstWord.length()==sameCount || firstWord.length()-1==sameCount){
                    result++;
                }
            }
            //2. 기준 단어가 한 글자 더 길 때 (제거하는 경우)
            else if(firstWord.length()==targetWord.length()+1){
                if(targetWord.length()==sameCount){
                    result++;
                }
            }
            //3. 기준 단어가 한 글자 더 짧을 때 (추가하는 경우)
            else if(firstWord.length()==targetWord.length()-1){
                if(firstWord.length()==sameCount){
                    result++;
                }
            }
        }
        System.out.println(result);
    }

    //알파벳 빈도수를 구해주는 메소드
    private static int[] getFrequency(String word){
        int[] count=new int[26];
        for(int i=0;i<word.length();i++){
            count[word.charAt(i)-'A']++;
        }
        return count;
    }
}
