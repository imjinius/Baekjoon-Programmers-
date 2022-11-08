import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] intArr = new int[5];
		int sum = 0;
		
		for(int i=0;i<5;i++){
			intArr[i] = Integer.parseInt(br.readLine());
			sum += intArr[i];
		}
		
		Arrays.sort(intArr);
		
		System.out.println(sum/5);
		System.out.println(intArr[2]);
		
	}
	
}