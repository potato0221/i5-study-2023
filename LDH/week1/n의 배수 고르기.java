import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        for(int num : numlist) {
            if(num % n == 0) arrlist.add(num);
        }
        
        int[] answer = new int[arrlist.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arrlist.get(i);
        }    
        
        return answer;
    }
}
