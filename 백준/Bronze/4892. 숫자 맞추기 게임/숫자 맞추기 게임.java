import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int caseNum = 1;
		
		if(num != 0){
			while(num != 0){
				int n1 = 3*num;
				int n2;
				String evenOdd;
				if(n1%2 == 0){
					evenOdd = "even";
					n2 = n1/2;
				} else {
					evenOdd = "odd";
					n2 = (n1+1)/2;
				}
				
				int n4 = (3*n2)/9;
				
				bw.write(caseNum+". "+evenOdd+" "+n4+"\n");
				num = Integer.parseInt(br.readLine());
				caseNum++;
			}
		}
		
		bw.flush();
		
	}
}