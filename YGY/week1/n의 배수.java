class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        if(2<=num && num<=100 && 2<=n && n<=9){
            answer = (num % n == 0) ? 1 : 0;    
        }
        return answer;
    }
}

