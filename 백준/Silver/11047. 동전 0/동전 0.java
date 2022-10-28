import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] coins = new int[N];
		int result = 0;
		int sum = 0;
		
		for(int i=0;i<N;i++)
			coins[i] = Integer.parseInt(br.readLine());
		
		for(int i=N-1;i>=0;i--){
			while(sum < K){
				sum += coins[i];
				result++;
			}
			
			if(sum > K){
				sum -= coins[i];
				result--;
			} 
			else if(sum == K) break;
		}
		
		System.out.println(result);
		
	}
	
}