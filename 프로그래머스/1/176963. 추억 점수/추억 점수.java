import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        //해시 선언
        HashMap<String,Integer> hs=new HashMap<>();
        
        //값 넣기
        for(int i=0;i<name.length;i++){
            hs.put(name[i],yearning[i]);
        }
        
        System.out.println(hs);
        
        //이제 계산하기
        for(int i=0;i<photo.length;i++){
            for(int j=0;j<photo[i].length;j++){
                if(hs.containsKey(photo[i][j])){
                    answer[i]+=hs.get(photo[i][j]);
                }
            }
        }
        
        return answer;
    }
}