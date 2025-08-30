class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cntP=0;
        int cntY=0;
            
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='p' || s.charAt(i)=='P') cntP+=1;
            else if(s.charAt(i)=='y' || s.charAt(i)=='Y') cntY+=1;
        }
        
        if(cntP==cntY) return true;
        else return false;
        
    
    }
}