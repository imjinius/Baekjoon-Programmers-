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
		String[] scores = null;
		double total = 0;
		double sum = 0;
		double avg = 0;
		double people = 0;
		
		while(a<cnt){
			scores = br.readLine().split(" ");
			total = Integer.parseInt(scores[0]);
			
			for(int i=1;i<=(scores.length-1);i++)
				sum += Integer.parseInt(scores[i]);
			
			avg = sum/total;
			
			for(int i=1;i<=(scores.length-1);i++){
				if(Integer.parseInt(scores[i])>avg){
					people++;
				}
			}
			
			bw.write(String.format("%.3f", (100/total)*people)+"%");
			bw.newLine();
			
			sum = 0;
			people = 0;
			a++;
		}
		bw.close();
		br.close();

	}

}
