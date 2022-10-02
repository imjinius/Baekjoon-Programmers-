import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numsPcs = Integer.parseInt(br.readLine()); 
        int[] intArr = new int[numsPcs];
        
        for(int i=0;i<numsPcs;i++)
        	intArr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(intArr);
        
        for(int i:intArr)
        	bw.write(i+"\n");
        
        bw.flush();
	}
	
}