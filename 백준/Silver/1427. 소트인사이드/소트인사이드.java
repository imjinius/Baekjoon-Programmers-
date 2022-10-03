import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] num = br.readLine().split(""); 
        Integer[] intArr = new Integer[num.length];
        
        for(int i=0;i<num.length;i++)
        	intArr[i] = Integer.parseInt(num[i]);

        Arrays.sort(intArr,Collections.reverseOrder());
        
        for(int i:intArr)
        	System.out.print(i);
        
	}
	
}