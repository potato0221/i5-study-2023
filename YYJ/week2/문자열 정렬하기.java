import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer =my_string.chars() // my_string을 int의 스트림으로 변환
                .filter(c -> c<65) // 아스키코드 65 미만인 값만 가져오도록 필터링
                .map(c -> c-48) // 값에서 48을 빼주고 저장함 (아스키코드 0 값이 48)
                .boxed() // Stream<Integer>형식으로 변환해서 sorted() 매서드를 사용 가능하게함
                .sorted() // 오름차순 정렬
                .mapToInt(Integer::intValue) // Stream<Integer> 를 다시 IntStream으로 변환
                .toArray(); //IntStream을 int 배열로 변환
        return answer;
    }
}
