import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

        int cnt = Integer.parseInt(br.readLine());
        int[] arr = new int[cnt];
        
        while(cnt != 0){
        	arr[cnt-1] = Integer.parseInt(br.readLine());
        	cnt--;
        }
        
        Arrays.sort(arr);
        for(int i:arr)
        	System.out.println(i);
        
	}
	
}