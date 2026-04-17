import java.util.*;

//런타임 에러 코드
class Solution {
    boolean solution(String s) {
        boolean answer = false;
        Stack<Character> stack=new Stack<>();
        stack.push(s.charAt(0));
        
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(ch);
            }else if(ch==')'){
                if(stack.size()>=1){
                    if(stack.peek()=='(') stack.pop();
                    else if(stack.peek()==')') stack.push(ch);
                }
            }
        }
        if(stack.isEmpty()) answer=true;
        return answer;
    }
}