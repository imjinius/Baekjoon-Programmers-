
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		br.close();
		double[] scores = new double[cnt];
		double sum = 0;
		
		for(int i=0;i<str.length;i++)
			scores[i] = Double.parseDouble(str[i]);
		
		Arrays.sort(scores);
		
		for(int i=0;i<scores.length;i++){
			sum += (scores[i]/scores[scores.length-1])*100;
		}
		
			System.out.println(sum/cnt);

	}

}
