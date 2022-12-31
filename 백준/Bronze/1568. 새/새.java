import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int birds = Integer.parseInt(br.readLine());
		int result = 0;
		int song = 1;

		while(birds != 0){
			if(birds - song >= 0){
				birds -= song;
				song++;
				result++;
			} else {
				song = 1;
				birds -= song;
				song++;
				result++;
			}
			
		}
		
		System.out.println(result);
		
	}
}