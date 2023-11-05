class Solution {
    public int[] solution(int n, int m) {
        // 최대공약수 -> 유클리드 알고리즘
        // (a>b) 자연수 a, b가 있으면 a를 b로 나눈 나머지가 0이면 b가 최대공약수
        // 0이 아니라면, a에 b값을 b에 나머지값을 넣고 반복.
        // 최소공배수 -> 두 수의 곱을 최대공약수로 나눈 것과 같음
        int[] answer = new int[2];
        
        answer[0] = gcd(n,m);
        answer[1] = n*m/answer[0];
        
        return answer;
    }
    
    public int gcd(int n, int m) {        
        int tmp, rest;
        if(n<m) {
            tmp = n;
            n = m;
            m = tmp;
        }
    
        while(m!=0) {
            rest = n%m;
            n = m;
            m = rest;
        }
        return n;
    }
}
