import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        //1.문자열을 BigInteger객체로 생성함
        BigInteger numA=new BigInteger(a);
        BigInteger numB=new BigInteger(b);
        
        //2.add 메소드를 사용하여 두 객체를 더한다.
        //BigInteger은 객체이므로 +기호를 쓸 수 없다
        BigInteger sum=numA.add(numB);
        
        //3. 결과를 다시 문자열(String)로 바꿔서 반환한다.
        return sum.toString();
    }
}