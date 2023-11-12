import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int[] arr1 = new int[sizes.length];
        int[] arr2 = new int[sizes.length];
        
        for (int i = 0; i < sizes.length; i++) {
            arr1[i] = Math.max(sizes[i][0], sizes[i][1]);
            arr2[i] = Math.min(sizes[i][0], sizes[i][1]);
        }

        int max1 = Arrays.stream(arr1).max().orElse(0);
        int max2 = Arrays.stream(arr2).max().orElse(0);

        return max1 * max2;
    }
}
//배열의 2개의 수를 큰 거, 작은 거 나눠서 배열을 만들고 그 중 최댓값만 서로 곱해주면 됨
