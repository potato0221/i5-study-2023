import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int g_div = 0;
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> b1 = new ArrayList<>();
        ArrayList<Integer> b_div = new ArrayList<>();
        
        // 1. 분자와 분모의 최대공약수 구하기
        // 2. 기약분수로 만든 후, 분모가 2 or 5인지 확인
        
        // 최대공약수 구하려면, 두 수의 약수 구한 후 비교.
        
        for(int i=2; i<a+1; i++) {  // a 약수 구하기
            if(i%a==0) {
                a1.add(i);
            }
        }
        
        for(int j=2; j<b+1; j++) {  // b 약수 구하기
            if(j%b==0) {
                b1.add(j);
            }
        }
        // a와 b의 약수 비교하여 최대공약수 구하기
        // 약수를 내림차순으로 정렬
        Collections.sort(a1, Collections.reverseOrder());
        Collections.sort(b1, Collections.reverseOrder());
        
        // 약수를 큰 것부터 하나씩 비교해서 공약수가 나오면 g_div에 저장 후 break로 for문 탈출
        if(a<=b) {
            for(int i=0; i<a1.size(); i++) {
                for(int j=0; j<b1.size(); j++) {
                    if(a1.get(i)==b1.get(j)) {
                        g_div = a1.get(i);
                        break;
                    }
                }
            }
        }else {
            for(int i=0; i<b1.size(); i++) {
                for(int j=0; j<a1.size(); j++) {
                    if(b1.get(i)==a1.get(j)) {
                        g_div = b1.get(i);
                        break;
                    }
                }
            }
        }
        // 최대공약수가 0이 아니면 최대공약수로 분모를 나눠준 후
        if(!(g_div==0)) {
            b=b/g_div;
        }
        // b의 약수를 b_div에 저장
        for(int i=1; i<b; b++) {
            if(b%i==0) {
                b_div.add(i);
            }
        }
        // b의 약수 중 2와 5가 존재하는지 확인
        for(int j=0; j<b_div.size(); j++) {
            if(b_div.get(j)==2 || b_div.get(j)==5) {
                answer = 1;
            }
            else answer = 2;
        }
        
        return answer;
    }
}