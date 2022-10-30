import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int people = Integer.parseInt(br.readLine());
		int[] time = new int[people];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0;
		int result = 0;
		
		for(int i=0;i<people;i++)
			time[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(time);
		
		for(int i=0;i<people;i++){
			sum += time[i];
			result += sum;
		}
		
		System.out.println(result);
		
	}
	
}