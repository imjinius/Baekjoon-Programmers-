import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String[] strArr = br.readLine().split(" ");
			int num1 = Integer.parseInt(strArr[0]);
			int num2 = Integer.parseInt(strArr[1]);
			
			if(num1 == 0 && num2 == 0)
				break;
			
			if(num1>num2)
				System.out.println("Yes");
			else if(num1<=num2)
				System.out.println("No");
			
		}
	}
}