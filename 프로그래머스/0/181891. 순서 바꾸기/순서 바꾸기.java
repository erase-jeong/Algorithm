class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int[] pre_n=new int[n];
        int[] next_n=new int[num_list.length-n];
        
        for(int i=0;i<num_list.length;i++){
            if(i<n){
                pre_n[i]=num_list[i];
            }else{
                next_n[i-n]=num_list[i];
            }
        }
        
        for(int i=0;i<next_n.length;i++){
            answer[i]=next_n[i];
        }
        
       
        for(int i=0;i<pre_n.length;i++){
            //answer[i+n]=pre_n[i];
            //System.out.print(pre_n[i]+" ");
            answer[next_n.length+i]=pre_n[i];
        }
        
        return answer;
    }
}
/*
1. answer의 길이 : 원래의 길이
2. pre_n
3. next_n
4. answer에 next_n, pre_n 순서로 넣기
*/