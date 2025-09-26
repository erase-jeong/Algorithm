import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer=new String[strings.length];
        List<String> list=new ArrayList<>();
        
        for(int i=0;i<strings.length;i++){
            list.add(strings[i].charAt(n)+strings[i]);
        }
        
        Collections.sort(list);
        
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i).substring(1);
        }
        
        return answer;
    }
}

/*
<정리>
1. 각 문자열의 n번째 글자를 먼저 비교한다.
2. n번째 글자가 같으면 → 문자열 자체를 사전순으로 비교한다.
----------------
인덱스 1번 값들만 꺼내와서 배열로 만들기
이거 정렬하기 
근데 각각이 몇번째 인덱스인지 기억할 수 있어야 하잖아?



*/