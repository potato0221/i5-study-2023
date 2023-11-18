class Solution {
    public int solution(int[][] sizes) {
        int max_row = 0;
        int max_col = 0;
        // 1. 가로, 세로 값 중 더 큰 값을 가로에 둔다.
        // 2. 가로 값 중 가장 큰 값과 세로 값 중 가장 큰 값을 곱하면 된다.
        
        for(int i=0; i<sizes.length; i++) {
            // 가로 세로 두 값 중 더 큰 수를 가로에, 작은 수를 세로에 둔다.
            int row = Math.max(sizes[i][0], sizes[i][1]);
            int col = Math.min(sizes[i][0], sizes[i][1]);
            // max_row에 가로 값 중 가장 큰 수를 담고
            // max_col에 세로 값 중 가장 큰 수를 담는다.
            max_row = Math.max(max_row, row);
            max_col = Math.max(max_col, col);
        } 
        return max_row * max_col;
    }
}