class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int s=0;
        int t=0;
        if(1<=n && n<=1000000 && 1<=m && m<=1000000){
            int j;
            if(n<m){
                j = n;
            }
            else 
                j= m;
            for(int i = 1; i<=j ; i++){
                if(n%i==0 && m%i ==0){
                    s = i;
                }
            }
            if(n<m){
                if(m%n==0){
                    t=m;
                }
                else
                    t=n*m;
            }
            else{
                if(n%m==0){
                    t=n;
                }
                else
                    t=n*m;
            }
        }
        answer[0]= s;
        answer[1]= t;
        return answer;
    }
}

