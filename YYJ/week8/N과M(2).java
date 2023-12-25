import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] finished;
    private static int[] arr;
    public static StringBuilder sb = new StringBuilder();
    public static int n;
    public static int m;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        finished = new boolean[n + 1];
        arr = new int[m];
        dfs(0, 1);
        System.out.println(sb);
    }

    private static void dfs(int depth, int start) {

        if (depth == m) {
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i <= n; i++) {
            if (!finished[i]) {
                finished[i] = true;
                arr[depth] = i;
                dfs(depth + 1, i + 1);
                finished[i] = false;
            }
        }
    }
}
