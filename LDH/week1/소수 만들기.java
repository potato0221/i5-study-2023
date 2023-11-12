import java.util.*;

class Solution {   
    public int solution(int[] nums) {
        int answer = 0;
        boolean[] isPrime = new boolean[3001];
        Arrays.fill(isPrime, true);
        
        isPrime[0] = isPrime[1] = false;
        
        for(int i = 2; i <= 3000; i++) {
            if(isPrime[i]) {
                for(int j = i * i; j <= 3000; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];

                    if(isPrime[sum]) answer++; 
                }
            }
        }

        return answer;
    }
}
