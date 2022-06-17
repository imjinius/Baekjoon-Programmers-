import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static int d(int number) {

		int cnt = 0;
		int n = 0;
		int sub = 0;
		
		if(0<number && number<100) {
			cnt = number;
		} else if(100<=number && number<1001) {
			cnt = 99;
			for(int i=100;i<(number+1);i++){
				int hun = i/100;
				int ten = (i%100)/10;
				int one = i%10;
				if((hun-ten)==(ten-one)){
					cnt++;
				}
			}
		}
		return cnt;
	}
 

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int number = Integer.parseInt(br.readLine());

		int result = Main.d(number);
		
		bw.write(Integer.toString(result));
		
		br.close();
		bw.close();

	}

 

}
