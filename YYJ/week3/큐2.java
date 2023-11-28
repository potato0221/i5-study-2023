import java.io.*;
import java.util.StringTokenizer;

public class Main {
    //static 변수로 선언 해서 각 메서드들을 static으로 선언하고 이 값에 쉽게 접근 할 수 있게 함
    private static int[] queue = new int[2000000];
    private static int front = 0;
    private static int rear = 0;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push")) {
                push(Integer.parseInt(st.nextToken()));
            }
            else if(command.equals("pop")){
                pop();
            }
            else if(command.equals("size")){
                size();
            }
            else if(command.equals("empty")){
                empty();
            }
            else if(command.equals("front")){
                front();
            }
            else if(command.equals("back")){
                back();
            }
        }
        br.close();
        System.out.println(sb);

    }

    private static void push(int value){
        queue[rear++]=value;
    }

    private static void pop() {
        if (rear == front) {
            sb.append(-1).append("\n");
        } else {
            sb.append(queue[front]).append("\n");
            queue[front++] = 0;
        }
    }

    private static void size(){
        sb.append(rear - front).append("\n");
    }

    private static void empty(){
        if (rear == front) {
            sb.append(1).append("\n");
        } else sb.append(0).append("\n");
    }

    private static void front(){
        if (front != rear) {
            sb.append(queue[front]).append("\n");
        } else sb.append(-1).append("\n");
    }

    private static void back () {
        if (rear != front) {
            sb.append(queue[rear - 1]).append("\n");
        } else sb.append(-1).append("\n");
    }
}
