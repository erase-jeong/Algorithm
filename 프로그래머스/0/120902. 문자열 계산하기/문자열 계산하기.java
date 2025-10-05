class Solution {
    public int solution(String my_string) {
        String[] arr=my_string.split(" ");
        int answer=Integer.valueOf(arr[0]);
        
        for(int i=1;i<arr.length;i++){
            if(arr[i].equals("+")){
                answer+=Integer.valueOf(arr[i+1]);
            }else if(arr[i].equals("-")){
                answer-=Integer.valueOf(arr[i+1]);
            }else{
                continue;
            }
        }
        return answer;
    }
}



/*
1.공백을 기준으로 쪼개서 리스트에 값 넣기 (배열은 크기 정해져있으니깐)
2.홀수번째 값은 숫자, 짝수번째 값은 문자 라는 걸 이용해서 
    홀수번째 => 정수형
    짝수번쨰 => 
*/