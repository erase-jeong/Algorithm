class Solution {
    public int solution(String A, String B) {
        int len = A.length();

        for (int i = 0; i < len; i++) {
            String temp = A.substring(len - i) + A.substring(0, len - i);
            
            if (temp.equals(B)) {
                return i; // i번 밀었을 때 같으면 바로 반환
            }
        }
        return -1; // 끝까지 안 맞으면 -1
    }
}



/*
class Solution {
    public int solution(String A, String B) {
        int len=A.length();
        int answer = -1;
        
        for(int i=0;i<len;i++){
            //String front=A.substring(len-i);
            //String back=A.substring(0,len-i);
            
            String temp=A.substring(len-i)+A.substring(0,len-i);
            
            answer+=1;
            if(temp.equals(B)){
                break;
            }
        }
        
        if(answer==A.length()-1) answer=-1;
       
        return answer;
    }
}
*/



/*
0번 : hello
1번 : ohell
2번 : lohel
3번 : llohe
4번 : elloh

n-1번까지 밀어보고 안되면 안되는거임
substring이용해서 쪼개서 붙이기

i=1
back=string.substring(0,A.length-1)
front=string.substring(A.length-1)
*/
