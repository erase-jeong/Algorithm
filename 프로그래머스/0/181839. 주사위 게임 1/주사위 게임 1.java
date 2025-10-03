class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(a%2==1 && b%2==1){
            //System.out.println("둘다 홀수");
            answer=(int)(Math.pow(a,2)+Math.pow(b,2));
        }
        else if(a%2==0 && b%2==0){
            //System.out.println("둘다 짝수");
            answer=Math.abs(a-b); 
        }
        else{
            //System.out.println("둘 중 하나 홀수");
            answer=2*(a+b);
            
        }
        return answer;
    }
}

/*
모두 홀수인 경우
모두 짝수인 경우
나머지(둘 중 하나 홀수)
*/