import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer=new String[picture.length*k];
        
        //내부 값 수정하기
        //그 다음 복붙(k개씩)
        
        for(int i=0;i<picture.length;i++){
            String value=picture[i];
            String temp="";
            for(int j=0;j<value.length();j++){
                for(int l=0;l<k;l++){
                    temp+=value.charAt(j);
                }
            }
            picture[i]=temp;
        }
        
        //System.out.println(Arrays.toString(picture));
        
        
        int j=0;
        for(int i=0;i<picture.length;i++){
            String value=picture[i];
            
            for(int l=0;l<k;l++){
                answer[j]=value;
                j++;
            }
        }
        
        return answer;
    }
}

/*
- 개수도 곱하기
- 안에 내용도 곱하기

=> 큰 틀부터 잡으면서 하기

pri

*/



/*
1. 안에 내용 바꾸기
2. 그 다음에 k만큼 곱해서 만들기
*/