import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line=br.readLine();

        //입력받은걸 배열로 카운트 하기
        int[] arr=new int[26];
        for(int i=0;i<line.length();i++){
            char ch=line.charAt(i);
            if(ch>='A' && ch<='Z'){
                arr[ch-'A']+=1;
            }else{
                arr[ch-'a']+=1;
            }
        }
        
        //최댓값 찾기
        int max=-1;
        char ch='?';
        for(int i=0;i<26;i++){
            if(arr[i]>max){
                max=arr[i];
                ch=(char)('A'+i);
            }
            else if(arr[i]==max){
                ch='?';
            }
        }
        System.out.println(ch);
    }
}
