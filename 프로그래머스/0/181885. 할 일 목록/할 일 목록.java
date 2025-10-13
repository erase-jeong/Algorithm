class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int n=0;
        for(boolean b : finished){
            if(b==false) n++;
        }
        
        String[] answer=new String[n];
        
        int j=0;
        for(int i=0;i<todo_list.length;i++){
            if(finished[i]==false){
                answer[j]=todo_list[i];
                j++;
            }
        }
        
        return answer;
    }
}

/*
1. finished 에서 false의 개수를 센다 => 정답 배열 만들기
2. 반복문 돌면서 넣기
*/
