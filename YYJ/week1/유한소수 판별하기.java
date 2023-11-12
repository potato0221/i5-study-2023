class Solution {
    public int solution(int a, int b) {
        int b1=b;
        int gcd;

        while(b!=0){
            int tmp=b;
            b=a%b;
            a=tmp; 
        }
        gcd=a; 

        while(b1/gcd!=1){
            if(b1/gcd%2==0){
                b1/=2;     
            }else if (b1/gcd%5==0){
                b1/=5;

            }else return 2;
        }
        return 1;

    }
}
