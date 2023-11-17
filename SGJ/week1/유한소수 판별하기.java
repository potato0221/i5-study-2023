class Solution {
    public int solution(int a, int b) {
        
        int answer = 0;
        int c = a;
        int d = b;
        while (d != 0) {
            int temp = d;
            d = c % d;
            c = temp;
        }
        b = b / c;
        while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }
        if (b == 1) {
            return 1;
        }
        return 2;
    }
}
