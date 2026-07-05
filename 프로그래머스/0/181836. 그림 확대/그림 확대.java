import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer=new String[picture.length*k];
        //A->A'로 만들기
        for(int i=0;i<picture.length;i++){
            String now=picture[i];
            String update="";
            for(int j=0;j<now.length();j++){
                for(int x=0;x<k;x++){
                    update+=now.charAt(j);
                }
            }
            picture[i]=update;
        }
        
        //리스트로 만들고 그걸 배열에 넣자.
        List<String> lst=new ArrayList<>();
        
        //[A',A',B',B'.. ]로 만들기
        for(int i=0;i<picture.length;i++){
            for(int x=0;x<k;x++){
                lst.add(picture[i]);
            }
        }
        
        for(int i=0;i<answer.length;i++){
            answer[i]=lst.get(i);
        }
        
        return answer;
    }
}



/*
1. 안에 내용 바꾸기
2. 그 다음에 k만큼 곱해서 만들기
*/