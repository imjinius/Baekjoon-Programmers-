import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int caseCnt = Integer.parseInt(br.readLine());
		int[] arr1 = new int[caseCnt];
		Integer[] arr2 = new Integer[caseCnt];
		
		int result = 0;
		
		String[] arr1Num = br.readLine().split(" ");
		String[] arr2Num = br.readLine().split(" ");
		
		
		for(int i=0;i<caseCnt;i++){
			arr1[i] = Integer.parseInt(arr1Num[i]);
			arr2[i] = Integer.parseInt(arr2Num[i]);
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2, Collections.reverseOrder());
		
		for(int i=0;i<caseCnt;i++){
			result += (arr1[i]*arr2[i]);
		}
		
		System.out.println(result);
		
	}
	
}