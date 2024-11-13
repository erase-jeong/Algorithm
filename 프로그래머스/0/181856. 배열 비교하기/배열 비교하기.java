class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;

        // arr1 배열의 합 구하기
        for (int num : arr1) {
            sum1 += num;
        }

        // arr2 배열의 합 구하기
        for (int num : arr2) {
            sum2 += num;
        }

        // 길이를 비교하여 결과 반환
        if (arr1.length > arr2.length) {
            return 1;
        } else if (arr1.length < arr2.length) {
            return -1;
        } else {
            // 길이가 같을 때 합을 비교하여 결과 반환
            if (sum1 > sum2) {
                return 1;
            } else if (sum1 < sum2) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}