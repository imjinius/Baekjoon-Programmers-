import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[] args){
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			
			String input = br.readLine();
			int seq, a, b = 0;
			
			while (input != null) {
				seq = input.indexOf(" ");
				a = Integer.parseInt(input.substring(0, seq));
				b = Integer.parseInt(input.substring(seq + 1));
                
				bw.write(Integer.toString(a + b));
				bw.newLine();

				input = br.readLine();
			}
			
			bw.close();
            br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
    }
}