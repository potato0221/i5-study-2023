import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;
        
        for(int[] size : sizes) {
            Arrays.sort(size); 
            maxW = Math.max(maxW, size[1]);
            maxH = Math.max(maxH, size[0]);
        }
        return maxW * maxH;
    }
}
