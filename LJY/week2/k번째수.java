import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> k_Num = new ArrayList<>();
        
        for(int i = 0; i<commands.length; i++) {
            for(int j= commands[i][0]-1; j<commands[i][1]; j++) {
                k_Num.add(array[j]); //array에 i부터 j까지 값 추가
                Collections.sort(k_Num); // 오름차순으로 정렬
            }
            // i부터 j까지 값 다 받은 후에, k번째 수 answer에 추가
            answer[i] = k_Num.get(commands[i][2]-1);
            k_Num.clear();  // k_Num 초기화
        }
        
        return answer;
    }
}