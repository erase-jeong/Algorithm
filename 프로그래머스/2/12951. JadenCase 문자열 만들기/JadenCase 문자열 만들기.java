class Solution {
    public String solution(String s) {
        StringBuilder sb=new StringBuilder();
        boolean newWord=true; //단어의 첫 문자인지 여부
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(c==' '){
                sb.append(' ');
                newWord=true; //공백 다음은 새 단어 시작
            }else if(newWord){
                //단어의 첫 문자
                if(Character.isDigit(c)){
                    sb.append(c); //숫자면 그대로
                }else{
                    sb.append(Character.toUpperCase(c)); //알파벳이면 대문자
                }
                newWord=false;
            }else{
                //단어의 나머지 문자
                sb.append(Character.toLowerCase(c));
            }
        } 
        
        return sb.toString();
    }
}

/*
1st. String 배열로 만든다.
2nd. if : 첫문자가 숫자이면 =>  나머지 다 소문자로
     else : 첫문자가 문자이면 => 첫문자 대문자 + 나머지 다 소문자 


시간복잡도 고려 안해도 충분

첫 문자 => 대문자, 그 외의 알파벳은 소문자

if(첫문자 숫자인 경우){

}else{  //문자인 경우
}

*시간복잡도 고려
*/