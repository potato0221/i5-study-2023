public class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        boolean[] primeArr = new boolean[3000];

        for (int i = 0; i < primeArr.length; i++) {
            primeArr[i] = true;
        }

        primeArr[0] = primeArr[1] = false;

        for (int i = 2; i < 3000; i++) {
            if (primeArr[i]) {
                for (int j = i * i; j < 3000; j += i) {
                    primeArr[j] = false;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (primeArr[sum]) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
