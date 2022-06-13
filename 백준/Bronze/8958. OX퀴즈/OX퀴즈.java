import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		int a = 0;
		int result = 0;
		int plus = 1;
		
		while(a<cnt){
			String[] arr = br.readLine().split("");
			for(int i=0;i<arr.length;i++){
				if(arr[i].equals("O")){
					result += plus;
					plus++;
				} else if(arr[i].equals("X")){
					plus = 1;
				}
			}
			bw.write(Integer.toString(result));
			bw.newLine();
			
			result = 0;
			plus = 1;
			a++;
			
		}
		bw.close();
		br.close();

	}

}
