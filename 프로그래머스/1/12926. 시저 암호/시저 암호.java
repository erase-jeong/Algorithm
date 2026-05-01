import java.util.*;

class Solution{
    public String solution(String s, int n){
        StringBuilder answer=new StringBuilder();
        char[] upper=new char[26];
        char[] lower=new char[26];
        
        //1.알파벳 배열 초기화
        for(int i=0;i<26;i++){
            upper[i]=(char)('A'+i);
            lower[i]=(char)('a'+i);
        }
        
        //2.문자열 한 글자씩 확인
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            //공백처리(공백은 밀어도 공백이어야 함)
            if(ch==' '){
                answer.append(' ');
                continue;
            }
            
            if(Character.isUpperCase(ch)){
                for(int j=0;j<26;j++){
                    if(ch==upper[j]){
                        //26을 넘어가면 다시 0부터 시작하게 만드는 핵심 로직
                        int nextIdx=(j+n)%26;
                        answer.append(upper[nextIdx]);
                        break; //문자를 찾았으면 안쪽 for문 종료
                    }
                }
            }else if(Character.isLowerCase(ch)){
                for(int j=0;j<26;j++){
                    if(ch==lower[j]){
                        int nextIdx=(j+n)%26;
                        answer.append(lower[nextIdx]);
                        break;
                    }
                }
            }
        }
        return answer.toString();
    }
}