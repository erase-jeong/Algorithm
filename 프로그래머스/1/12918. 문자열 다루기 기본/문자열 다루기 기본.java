class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        //문자열 길이 판단
        if(s.length()==4 || s.length()==6){
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'){
                }
                else{
                    return false;
                }
                System.out.println();
            }
            
        }else{
            return false;
        }
        return answer;
    }
}
