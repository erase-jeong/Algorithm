class Solution {
    public int solution(int[] numbers, int k) {
        int index=(k-1)*2%numbers.length; //몇 칸인지 + 원 넘어가면 되돌리기
        return numbers[index];
    }
}

