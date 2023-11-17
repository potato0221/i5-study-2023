import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt(); 
    	int M = sc.nextInt(); 
    	int [] card = new int [N];
    	
    	for(int i=0; i<N; i++) {
    		card[i] = sc.nextInt();
    	}
    	int mini = 0;
    
    	for(int i=0; i<=N-3; i++) { 
    		for(int j=i+1; j<=N-2; j++) { 
    			for(int k=j+1; k<N; k++) { 
    				int hap = card[i]+card[j]+card[k];
    				
    				if(hap == M) {
    					System.out.println(hap);
    					return;
    				}
    			
    				if(mini < hap && hap < M) {
    					mini = hap;
    				}
    			}
    		}
    	}
    	System.out.println(mini);
    }
}
