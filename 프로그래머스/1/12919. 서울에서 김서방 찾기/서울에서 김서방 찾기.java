class Solution {
    public String solution(String[] seoul) {
        int pos=-1;
        
        for(int i=0;i<seoul.length;i++){
            if(seoul[i].equals("Kim")) {
                pos=i;
                //return "김서방은 "+i+"에 있다";
            } 
        }
        
        return "김서방은 "+pos+"에 있다";
    }
}