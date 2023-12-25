import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] finished;
    public static int[][] arr;
    public static  StringBuilder sb=new StringBuilder();
    public static int n;
    public static int m;
    public static int v;

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        v=Integer.parseInt(st.nextToken());

        arr=new int[n+1][n+1];

        for(int i=0;i<m;i++){
            StringTokenizer st1=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st1.nextToken());
            int b=Integer.parseInt(st1.nextToken());

            arr[a][b]=1;
            arr[b][a]=arr[a][b];
        }
        finished=new boolean[n+1];
        dfs(v);
        sb.append("\n");

        finished=new boolean[n+1];
        bfs(v);
        System.out.println(sb);
    }

    private static void dfs(int v) {

        finished[v]=true;
        sb.append(v+" ");

        for(int i=0;i<=n;i++){
            // 연결된 edge가 있는데 finished가 false라면 방문 해라
            if(arr[v][i]==1&&!finished[i]){
                dfs(i);
            }
        }
    }

    private static void bfs(int v) {
        Queue<Integer> q=new LinkedList<>();

        q.add(v);
        finished[v]=true;

        while (!q.isEmpty()){
            v=q.poll();
            sb.append(v+" ");

            for(int i=1;i<=n;i++){
                if(arr[v][i]==1&&!finished[i]){
                    q.add(i);
                    finished[i]=true;
                }
            }
        }
    }
}
