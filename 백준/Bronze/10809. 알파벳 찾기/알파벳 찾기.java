import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] arr = br.readLine().toCharArray();
		int num = 0;
		int[] numArr = new int[26];
		for(int i=0;i<numArr.length;i++){
			numArr[i] = -1;
		}
		
		for(int i=0;i<arr.length;i++){
			num = arr[i]-97;
			if(numArr[num] == -1){
				numArr[num] = i;
			}
		}
		
		for(int n:numArr)
			System.out.print(n+" ");
		
		
		
		br.close();

	}

 

}
