import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int caseCnt = Integer.parseInt(br.readLine());
		
		while(caseCnt != 0){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			if(n < 12)
				bw.write(-1+"\n");
			else if(n >= 12 && m < 4)
				bw.write(-1+"\n");
			else 
				bw.write((11*m)+4+"\n");
			
			caseCnt--;
		}
		bw.flush();
		
	}
	
}