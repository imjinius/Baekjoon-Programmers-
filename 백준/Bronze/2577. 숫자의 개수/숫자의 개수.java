import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Integer num = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
		br.close();
		int val = 0;
		
		
		for(int i=0;i<10;i++){
			int count = 0;
			val = num;
			while(val != 0){
				if(i == (val%10)){
					count++;
				}
				val /= 10;
			}
			System.out.println(count);
		}
		
		

	}

}
