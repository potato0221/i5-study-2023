class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length;
        int sum = 0;
        
        // 3개의 수를 더하려면 반복문 3개가 필요.
        // nums[0] + nums[1] + nums[2]
        // nums[0] + nums[1] + nums[3]
        // nums[0] + nums[2] + nums[3]
        // nums[1] + nums[2] + nums[3]
        for(int i=0; i<len-2; i++) {
            for(int j=i+1; j<len-1; j++) {
                for(int k=j+1; k<len; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if(primeNumber(sum)) answer++;
                }
            }
        }
        return answer;
    }
    
    // 소수 구하는 법 : 그 수의 제곱근까지만 반복해보면 됨.
    public boolean primeNumber(int n) {
        for(int i=2; i<Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return true;
    }
}