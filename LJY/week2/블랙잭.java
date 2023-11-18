import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int blackJ = 0;
        int sum = 0;
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();  // 2번째 줄에 있는 번호 목록을 받는 배열 생성
        }
        
        for(int i=0; i<n-2; i++) {
            if(arr[i]>m) continue; // 3개의 수 합이 m보다 같거나 작아야 하므로, 1개의 수가 m보다 크면 고려하지 않고 넘어간다.
            for(int j=i+1; j<n-1; j++) {
                if(arr[i]+arr[j]>m) continue;
                for(int k=j+1; k<n; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum<=m) { // 3개의 수 합이 m보다 같거나 작을 때,
                        blackJ = Math.max(blackJ, sum); // Math.max 함수를 이용해 그 중 가장 큰 값을 담는다.
                    }
                }
            }
        }
        System.out.println(blackJ);
    }
}