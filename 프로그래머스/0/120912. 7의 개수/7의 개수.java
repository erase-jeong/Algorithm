class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i=0;i<array.length;i++){
            String str=String.valueOf(array[i]);
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='7') answer++;
            }
        }
        return answer;
    }
}

/*
- 전체 배열을 순회한다.
그러면서 일단은 숫자로 처리하는게 아니라 숫자를 문자로 바꾼다.
그 다음에 문자 7이 있는지 체크하면서 확인한다.
7, 77, 17
*/
