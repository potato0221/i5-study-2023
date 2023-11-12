class Solution {
    public int solution(int a, int b) {
        if(0<a&& a<=1000 && 0<b&& b<=1000){
            for(int i=1; i<=a; i++){
                if(a%i==0 && b%i==0){
                    a /= i;
                    b /= i;
                }
            }
            if( b % 2 ==0 || b % 5 == 0){
                return 1;
            }else {
                return 2;
            }
        }
        else
            return -1;
    }
