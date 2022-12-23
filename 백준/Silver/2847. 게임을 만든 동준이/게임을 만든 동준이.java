import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int level = Integer.parseInt(br.readLine());
		int[] levels = new int[level];
		int result = 0;
		
		for(int i=0;i<level;i++){
			levels[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=level-2;i>=0;i--){
			int high = levels[i+1];
			int low = levels[i];
			if(low>=high){
				result += low - (high-1);
				levels[i] = high-1;
			}
		}
		
		System.out.println(result);
	}
}