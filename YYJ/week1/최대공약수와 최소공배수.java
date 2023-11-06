class Solution {
    public int[] solution(int n, int m) {
        int[] answer =new int[2];
        int lcm=n*m;
        while(m!=0){
            int tmp=m;
            m=n%m;
            n=tmp;
        }
        answer[0]=n;
        answer[1]=lcm/answer[0];

        return answer;
    }
}
