class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i=0;i<str_list.length;i++){
            if(!str_list[i].contains(ex)){
                answer+=str_list[i];
            }
        }
        return answer;
    }
}

/*
1. ex가 있는 문자열 확인하기 => 그거는 제외하고 더하기

반복문 순회하기
    if(문자열에 ex가 없다면)
        String 에 값 추가
*/