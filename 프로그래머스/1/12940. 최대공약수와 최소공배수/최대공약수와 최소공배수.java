class Solution {
    public int[] solution(int n, int m) {
        //최대공약수
        int gcd=0;
        
        //둘 중에 작은 값
        int k=n<m?n:m;
        for(int i=k;i>=1;i--){
            if(n%i==0 && m%i==0) {gcd=i; break;}
        }
        int lcm=(n*m)/gcd;
        
        int[] answer={gcd, lcm};
        return answer;
    }
}