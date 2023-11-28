import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque=new ArrayDeque();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command=st.nextToken();
            if(command.equals("1")){
                deque.addFirst(Integer.parseInt(st.nextToken()));
            }
            else if(command.equals("2")){
                deque.addLast(Integer.parseInt(st.nextToken()));
            }
            else if(command.equals("3")){
                if(!deque.isEmpty()){
                    sb.append(deque.getFirst()).append("\n");
                    deque.removeFirst();
                }else sb.append(-1).append("\n");
            }
            else if(command.equals("4")){
                if(!deque.isEmpty()){
                    sb.append(deque.getLast()).append("\n");
                    deque.removeLast();
                }else sb.append(-1).append("\n");
            }
            else if(command.equals("5")){
                sb.append(deque.size()).append("\n");
            }
            else if(command.equals("6")){
                if(deque.isEmpty()){
                    sb.append(1).append("\n");
                }else sb.append(0).append("\n");
            }
            else if(command.equals("7")){
                if(!deque.isEmpty()){
                    sb.append(deque.getFirst()).append("\n");
                }else sb.append(-1).append("\n");
            }
            else if(command.equals("8")){
                if(!deque.isEmpty()){
                    sb.append(deque.getLast()).append("\n");
                }else sb.append(-1).append("\n");
            }
        }        
        br.close();
        System.out.println(sb);
    }
}
