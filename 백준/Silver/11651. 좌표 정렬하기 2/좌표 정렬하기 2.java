import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int pcs = Integer.parseInt(br.readLine()); 
        int[][] intArr = new int[pcs][2];
        
        StringTokenizer st;
        
        for(int i=0;i<pcs;i++){
        	st = new StringTokenizer(br.readLine());
        	intArr[i][0] = Integer.parseInt(st.nextToken());
        	intArr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(intArr, (e1,e2) -> {
        	if(e1[1]==e2[1]){
        		return e1[0] - e2[0];
        	} else {
        		return e1[1] - e2[1];
        	}
        });
        
        for(int i=0;i<intArr.length;i++){
        	bw.write(intArr[i][0]+" "+intArr[i][1]+"\n");
        }
        	
        bw.flush();
	}
        
}