// 1. 스캐너 ( BufferReader, Tokenizer 사용보다 1.8배정도 느림)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
      
        long[] mem=new long[101];


        // 0번에 0, 1~3에 첫 삼각형의 세 변 값인 1을 각각 넣어준다.
        mem[0]=0;
        mem[1]=1;
        mem[2]=1;
        mem[3]=1;

      // 다음 삼각형의 변의 값은 2번째 전, 3번째 전에 저장된 값을 더한 값과 같다.
        for (int i = 4; i < 101; i++) {
            mem[i] = (mem[i - 2] + mem[i - 3]);
        }

        for(int i=0;i<n;i++){
            int p=scanner.nextInt();
            System.out.println(mem[p]);    
        }
    }
}

// 2. BufferReader, Tokenizer (Scanner 사용보다 1.8배 정도 빠름)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
       
        int n = Integer.parseInt(br.readLine());

        long[] mem=new long[101];

        mem[0]=0;
        mem[1]=1;
        mem[2]=1;
        mem[3]=1;

        for (int i = 4; i < 101; i++) {
            mem[i] = (mem[i - 2] + mem[i - 3]);
        }

        for(int i=0;i<n;i++){            
            st=new StringTokenizer(br.readLine()," ");
            int p = Integer.parseInt(st.nextToken());
            System.out.println(mem[p]);
        }
    }
}

