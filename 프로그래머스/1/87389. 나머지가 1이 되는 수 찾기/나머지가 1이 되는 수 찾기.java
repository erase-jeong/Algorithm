import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> lst=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==1) lst.add(i);
        }
        return lst.get(0);
    }
}