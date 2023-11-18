import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        StackList stack = new StackList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        // 여기까지 입력에 대한 처리

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("1")) {
                stack.push(Integer.parseInt(st.nextToken()));
            } 
            else if (command.equals("2")) {
                if (!stack.isEmpty()) {
                    sb.append(stack.peek()).append("\n");
                    stack.pop();
                } else {
                    sb.append(-1).append("\n");
                }
            } 
            else if (command.equals("3")) {
                sb.append(stack.count()).append("\n");
            } 
            else if (command.equals("4")) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } 
            else if (command.equals("5")) {
                if (!stack.isEmpty()) {
                    sb.append(stack.peek()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
        }
        br.close();
        System.out.println(sb);
    }

    public static class StackList {
      // 처음에 int[] 로 구현 했다가 인덱스 오류로 실패하고 ArrayList로 선회함
        private ArrayList<Integer> stack;
        int top;

        public StackList() {
            stack = new ArrayList<>();
        }

        public void push(int value) {
            stack.add(value);
        }

        public void pop() {
            if (!stack.isEmpty()) {
                stack.remove(stack.size() - 1);
            }
        }

        public int count() {
            return stack.size();
        }

        public boolean isEmpty() {
            return stack.isEmpty();
        }

        public int peek() {
            if (!stack.isEmpty()) {
                return stack.get(stack.size() - 1);
            } else {
                return 0;
            }
        }
    }
}





// 실패 했을 때 구현했던 코드, 배열은 크기 조절이 불가해서 인덱스 오류로 실패 했던것 같다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main1{
    public static void main(String[] args) throws IOException {
        Stack1 stack=new Stack1(100000);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("1")){
                 stack.push(Integer.parseInt(st.nextToken())); 
            }
            else if(command.equals("2")){
                if(stack.peek()!=0){
                    sb.append(stack.peek()).append("\n");
                }
                else sb.append(-1).append("\n");         
                stack.pop();
            }
            else if(command.equals("3")){
                sb.append(stack.count()).append("\n");
            }
            else if(command.equals("4")){
                sb.append(stack.isEmpty()).append("\n");
            }
            else if(command.equals("5")){
                if(stack.peek()!=0){
                    sb.append(stack.peek()).append("\n");
                }else sb.append(-1).append("\n");
            }
        }
        br.close();
        System.out.println(sb);
    }


    public static class Stack1{
        int[] stack;
        int size;
        int top;

        public Stack1(int size){
            this.size=size;
            top=-1;
            stack=new int[size];
        }

        public void push(int value){
            stack[++top]=value;
        }

        public void pop(){
            stack[top--]=0;
        }

        public int count(){
            return top+1;
        }

        public int isEmpty(){
            if(top==-1){
                return 1;
            }else return 0;
        }

        public int peek(){
            if(top!=-1){
                return stack[top];
            }else return 0;
        }
    }
}
