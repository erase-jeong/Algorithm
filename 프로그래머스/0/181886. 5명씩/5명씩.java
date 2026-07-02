class Solution {
    public String[] solution(String[] names) {
        int n;
        if(names.length%5==0) n=names.length/5;
        else n=names.length/5+1;
        
        String[] answer=new String[n];
        
        int j=0;
        for(int i=0;i<n;i++){ //0, 5, 10 처럼 5의 배수 값을 넣는다
            answer[i]=names[j];
            j+=5;
        }
        return answer;
    }
}