import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    queue.offer(num);
                    break;
                case "pop":
                    sb.append(queue.isEmpty() ? "-1\n" : String.valueOf(queue.poll()) + "\n");
                    break;
                case "size":
                    sb.append(String.valueOf(queue.size()) + "\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? "1\n" : "0\n");
                    break;
                case "front":
                    sb.append(queue.isEmpty() ? "-1\n" : String.valueOf(queue.peek()) + "\n");
                    break;
                case "back":
                    sb.append(queue.isEmpty() ? "-1\n" : String.valueOf(queue.peekLast()) + "\n");
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);
    }
}
//스택과 마찬가지로 이미 구현되어 있는 ArrayDeque를 이용했다.
문제에서 효율을 위해서 StringBuilder 등으로 입력과 출력을 처리하였다.
