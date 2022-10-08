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

		int cases = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while(cases != 0){
			st = new StringTokenizer(br.readLine());
			int brain = Integer.parseInt(st.nextToken());
			int zombie = Integer.parseInt(st.nextToken());
			
			if(brain<zombie)
				bw.write("NO BRAINS\n");
			else
				bw.write("MMM BRAINS\n");
			
			cases--;
		}
		
		bw.flush();
		
	}
	
}