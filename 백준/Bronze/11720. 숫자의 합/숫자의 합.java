import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		int sum = 0;
		
		String[] arr = br.readLine().split("");
		for(int i=0;i<arr.length;i++){
			sum += Integer.parseInt(arr[i]);
		}
		
		bw.write(Integer.toString(sum));
		
		bw.close();
		br.close();

	}

 

}
