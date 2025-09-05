import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        if(numbers[0]*numbers[1]>numbers[numbers.length-1]*numbers[numbers.length-2]){
            return numbers[0]*numbers[1];
        }
        else{
            return numbers[numbers.length-1]*numbers[numbers.length-2];
        }
    
    }
}

        //음수 * 음수는 양수다!
        //무조건 작은대로, 큰대로 정렬해서 하고 하는게 의미가 없다.
        //근데 음수*음수하려면 둘다 음수여야 하잖아?
        
        /*
        결론
        =>
        1. 일단 정렬한다.
        2. 제일 작은거 두개 곱하기 (음수*음수라면 젤 크니깐)
        3. 제일 큰거 두개 곱하기 (양수 * 양수)
        4. 2와 3 비교해서 큰거 return 
        */