import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String[] str = my_string.split("");
        int[] answer = Arrays.stream(str).filter(s -> s.matches("[0-9]")).mapToInt(Integer::parseInt).sorted().toArray();
        return answer;
    }
}
