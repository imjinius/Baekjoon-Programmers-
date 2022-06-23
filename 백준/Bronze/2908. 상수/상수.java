
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] nums = br.readLine().split(" ");
		String[] num1 = nums[0].split("");
		String[] num2 = nums[1].split("");
		int n1 = 0;
		int n2 = 0;
		int result = 0;
		
		n1 = (Integer.parseInt(num1[2])*100)+(Integer.parseInt(num1[1])*10)+Integer.parseInt(num1[0]);
		n2 = (Integer.parseInt(num2[2])*100)+(Integer.parseInt(num2[1])*10)+Integer.parseInt(num2[0]);
		
		if(n1>n2){
			result = n1;
		} else {
			result = n2;
		}
		
		System.out.println(result);
	}
}
