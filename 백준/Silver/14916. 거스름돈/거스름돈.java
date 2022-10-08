import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int change = Integer.parseInt(br.readLine());
		int quo = change/5;
		int rem = change%5;
		
		if(quo == 0){
			if(rem == 1 || rem == 3)
				System.out.println(-1);
			else
				System.out.println(rem/2);
		} else {
			if(rem == 1 || rem == 3)
				System.out.println((quo-1)+((change-(5*(quo-1)))/2));
			else if(rem == 0)
				System.out.println(quo);
			else
				System.out.println(quo+((change-(5*quo))/2));
		}
		
			
		
	}
	
}