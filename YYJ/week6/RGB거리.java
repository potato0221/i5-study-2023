import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int[][] cost = new int[n][3];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
          
            cost[i][0] = Integer.parseInt(st.nextToken());
            cost[i][1] = Integer.parseInt(st.nextToken());
            cost[i][2] = Integer.parseInt(st.nextToken());
        }

        // 두번째 줄 부터 값을 더하기 시작하는데 이전 라인에서 해당 색을 제외한 두개의 색 중 작은 값을 더해준다.
        // 왜냐하면 한가지 색이 연속으로 올 수 없기 때문에 이렇게 해준다.
        // 두번째줄부터 시작하는 이유는 첫번째 줄은 더해 올 값이 없기 때문이다.
        for (int i = 1; i < n; i++) {
            cost[i][0] += Math.min(cost[i - 1][1], cost[i - 1][2]);
            cost[i][1] += Math.min(cost[i - 1][0], cost[i - 1][2]);
            cost[i][2] += Math.min(cost[i - 1][0], cost[i - 1][1]);
        }

        // 누적 한 세 라인의 값 중 가장 작은 값을 출력 해 준다.
        System.out.println(Math.min(Math.min(cost[n - 1][0], cost[n - 1][1]), cost[n - 1][2]));
    }
}
