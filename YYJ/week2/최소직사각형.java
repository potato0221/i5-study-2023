import java.util.Arrays;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        for(int i=0;i<sizes.length;i++){
            Arrays.sort(sizes[i]);
            
        }
        int max0=0;
        int max1=0;
        
        for(int i=0;i<sizes.length;i++){
            if(max0<sizes[i][0]){
                max0=sizes[i][0];
            }
            if(max1<sizes[i][1]){
                max1=sizes[i][1];
            }
        }
        answer=max0*max1;
        
        return answer;
    }
}
