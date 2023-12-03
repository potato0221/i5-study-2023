// 1. Stack 클래스 사용
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);

            switch(st.nextToken()) {
                case "1" :
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "2" :
                    if(stack.isEmpty())
                        sb.append(-1).append('\n');
                    else
                        sb.append(stack.pop()).append('\n');
                    break;
                case "3" :
                    sb.append(stack.size()).append('\n');
                    break;
                case "4" :
                    if(stack.isEmpty())
                        sb.append(1).append('\n');
                    else
                        sb.append(0).append('\n');
                    break;
                case "5" :
                    if(stack.isEmpty())
                        sb.append(-1).append('\n');
                    else
                        sb.append(stack.peek()).append('\n');
                    break;
            }
        }

        System.out.print(sb.toString());
    }

}
// 2. 배열을 stack으로 사용
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int[] stack = new int[1000000];
    static int top = 0;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            switch(st.nextToken()) {
                case "1" : push(Integer.parseInt(st.nextToken())); break;
                case "2" : pop(); break;
                case "3" : size(); break;
                case "4" : empty(); break;
                case "5" : peek(); break;
            }
        }
        System.out.print(sb.toString());
    }

    static void push(int n) {
        stack[top++] = n;
    }
    static void pop() {
        if(top > 0) sb.append(stack[--top]).append("\n");
        else sb.append(-1).append("\n");
    }
    static void size() {
        sb.append(top).append("\n");
    }
    static void empty(){
        if(top == 0) sb.append(1).append("\n");
        else sb.append(0).append("\n");
    }
    static void peek() {
        if(top == 0) sb.append(-1).append("\n");
        else sb.append(stack[top-1]).append("\n");
    }

}
