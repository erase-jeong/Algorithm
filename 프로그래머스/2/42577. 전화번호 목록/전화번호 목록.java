import java.util.*;

class Solution {
    public boolean solution(String[] phoneBook) {
        //1.phoneBook을 정렬한다.
        Arrays.sort(phoneBook);
        
        //2. 1중 loop를 돌면서 앞번호가 뒷번호의 접두어인지 확인한다.
        for(int i=0;i<phoneBook.length-1;i++){
            if(phoneBook[i+1].startsWith(phoneBook[i]))
                return false;
        }
        
        //3. 여가까지 오지 못했다면 접두어가 없는 것이다.
        return true;
    }
}