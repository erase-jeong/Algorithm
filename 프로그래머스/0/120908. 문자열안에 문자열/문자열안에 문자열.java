class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        int start=0;
        int end=str2.length();
        for(int i=0;i<str1.length()-str2.length()+1;i++){
            if((str1.substring(start++,end++)).equals(str2)){
                return 1;
            }
        }

        return 2;

    }
}

/*
1. str2의 길이 구하기
2. [반복]str2의 길이만큼 str1을 돌면서 비교 (0~3, 1~4, 이렇게)
3. [조건문] 만약 같다면 바로 1출력
4. 아니면 2출력 (반복문 다 돌았는데도 없으면)
*/