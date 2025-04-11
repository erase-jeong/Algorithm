import java.util.*;

class Solution {
    public boolean solution(String[] phoneBook) {
        // phone_book의 길이만큼 탐색
        // 탐색한 항의 길이확인 
        // 그 길이 이상의 값이면서 그 string을 포함하면 false 반환
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0;i<phoneBook.length; i++)
            map.put(phoneBook[i], i);
        
        for(int i=0; i<phoneBook.length; i++)
            for(int j=0; j<phoneBook[i].length(); j++)
                if(map.containsKey(phoneBook[i].substring(0,j)))
                    return false;
                
                return true;
            
            
        
    }
}