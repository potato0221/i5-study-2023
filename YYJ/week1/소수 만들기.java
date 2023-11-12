class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    int tmp=nums[i]+nums[j]+nums[k];
                    int count=0;
                    for(int l=2;l<=Math.sqrt(tmp);l++){
                        if(tmp%l==0){
                            count++;
                        }
                    }
                    if(count==0) {
                        answer++;
                    }  
                }
            }
        }
        return answer;
    }
}
