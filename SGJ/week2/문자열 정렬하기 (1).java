import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        return my_string.chars()
            .filter(Character::isDigit)
            .map(Character::getNumericValue)
            .sorted()
            .toArray();
    }
}
//일단 문자열을 스트림으로 변환하기 위해 .chars()를 붙여준다.
그 다음 isDigit으로 숫자만 걸러서
정수형으로 만들고
정렬 후
배열로
