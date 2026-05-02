class Solution {
    boolean solution(String s) {
        int p=0,y=0;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='p' || ch=='P') p++;
            if(ch=='y' || ch=='Y') y++;
        }
        
        if(p==y) return true;
        else return false;
    }
}

/*
대문자로 통일하기 -> 굳이?
int p
int y

각 카운트 계산하기 -> 합계 비교
*/