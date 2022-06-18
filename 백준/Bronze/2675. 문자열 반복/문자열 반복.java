import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cases = Integer.parseInt(br.readLine());
		int cnt = 0;
		String[] arr = null;
		String[] alp = null;
		int re = 0;
		
		while(cnt<cases){
			arr = br.readLine().split(" ");
			re = Integer.parseInt(arr[0]);
			alp = arr[1].split("");
			for(int i=0;i<alp.length;i++){
				for(int j=0;j<re;j++){
					bw.write(alp[i]);
				}
			}
			
			bw.newLine();
			cnt++;
		}
				
		bw.close();
		br.close();

	}

 

}
