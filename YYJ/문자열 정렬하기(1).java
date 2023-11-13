import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer =my_string.chars() // my_string을 int의 스트림으로 변환
                .filter(c -> c<65) // 아스키코드 65 미만인 값만 가져오도록 필터링
                .map(c -> c-48) // 값에서 48을 빼주고 저장함 (아스키코드 0 값이 48)
                .sorted()
                .toArray(); //IntStream을 int 배열로 변환
        return answer;
    }
}
