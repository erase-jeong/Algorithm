class Solution {
    public String solution(String my_string){
        
        String answer = my_string;
        String[] vowels={"a","e","i","o","u"};
        
        for(String v:vowels){
            answer=answer.replaceAll(v, "");
        }
        
        return answer;
    }
}

/*
문자열은 그 자체로 손댈 수 없다.
그래서 문자 배열로 바꾸거나 stringbuilder? 로 해야한다.
*/