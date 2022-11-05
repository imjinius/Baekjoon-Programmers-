import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		String[] strArr = br.readLine().split(" ");
		int[] intArr = new int[strArr.length];
		for(int i=0;i<strArr.length;i++)
			intArr[i] = Integer.parseInt(strArr[i]);
		
		int find = Integer.parseInt(br.readLine());
		int result = 0;
		
		for(int i=0;i<intArr.length;i++){
			if(intArr[i]==find)
				result++;
		}
		
		System.out.println(result);
		
			
		
	}
	
}