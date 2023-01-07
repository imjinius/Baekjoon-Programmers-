import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] strArr = br.readLine().split(" ");
		
		while(!strArr[0].equals("#")){
			String alp = strArr[0];
			int result = 0;
			for(int i=0;i<strArr.length-1;i++){
				String[] splitArr = strArr[i+1].split("");
				for(int j=0;j<splitArr.length;j++){
					if(splitArr[j].equals(alp.toUpperCase()) || splitArr[j].equals(alp.toLowerCase())){
						result++;
					}
				}
			}
			bw.write(alp+" "+result+"\n");
			strArr = br.readLine().split(" ");
		}
		
		bw.flush();
	}
}