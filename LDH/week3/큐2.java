// 1. LinkedList 사용
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            switch(st.nextToken()) {
                case "push" : queue.add(Integer.parseInt(st.nextToken())); break;
                case "pop" : sb.append(!queue.isEmpty() ? queue.poll() : -1).append("\n"); break;
                case "size" : sb.append(queue.size()).append("\n"); break;
                case "empty" : sb.append(queue.isEmpty() ? 1 : 0).append("\n"); break;
                case "front" : sb.append(!queue.isEmpty() ? queue.peek() : -1).append("\n"); break;
                case "back" : sb.append(!queue.isEmpty() ? queue.getLast() : -1).append("\n");
            }
        }
        System.out.println(sb.toString());
    }

}

// 2. 배열 사용

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int[] queue = new int[2000000];
    static int front = 0;
    static int rear = 0;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            switch(st.nextToken()) {
                case "push" : push(Integer.parseInt(st.nextToken()));break;
                case "pop" : pop();break;
                case "size" : size(); break;
                case "empty" : empty(); break;
                case "front" : front(); break;
                case "back" : back();
            }
        }
        System.out.println(sb.toString());
    }

    static void push(int n) {
        queue[rear++] = n;
    }
    static void pop() {
        if(rear == front) sb.append(-1);
        else sb.append(queue[front++]);
        sb.append("\n");
    }
    static void size() {
        sb.append(rear - front).append("\n");
    }
    static void empty() {
        if(front == rear) sb.append(1);
        else sb.append(0);
        sb.append("\n");
    }
    static void front() {
        if(front == rear) sb.append(-1);
        else sb.append(queue[front]);
        sb.append("\n");
    }
    static void back() {
        if(front == rear) sb.append(-1);
        else sb.append(queue[rear-1]);
        sb.append("\n");
    }

}
