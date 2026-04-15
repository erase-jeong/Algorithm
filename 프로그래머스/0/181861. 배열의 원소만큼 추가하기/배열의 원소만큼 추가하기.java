class Solution {
    public int[] solution(int[] arr) {
        int n=0;
        for(int i=0;i<arr.length;i++){
            n+=arr[i];
        }
        System.out.println(n);
        
        int[] answer=new int[n];
        int k=0;
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=0;j<curr;j++){
                answer[k]=curr;
                k++;
            }
        }
        
        return answer;
    }
}
/*
각 원소의 수만큼 길이가 있다
length
*/