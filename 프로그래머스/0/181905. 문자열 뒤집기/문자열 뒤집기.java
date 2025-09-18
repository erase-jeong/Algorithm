class Solution {
    public String solution(String my_string, int s, int e) {
        
        char[] arr=my_string.toCharArray(); //문자열 -> char 배열 교환
        
        while(s<e){
            char temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            
            s++;
            e--;
        }
        
        return new String(arr);
    }
}

/*
[문제 이해]
(s,e) --> s가 e보다 작을 때까지 반복하면서, 위치를 교체

*위치교체할 때 : temp사용하기!

while(s<e){
    char temp=my_string.charAt(s);
    my_string.charAt(s)=my_string.charAt(e);
    my_string.charAt(e)=temp;
    s++;
    e--;
}

=> 리스트는 접근이 안되서 안됨.
*/