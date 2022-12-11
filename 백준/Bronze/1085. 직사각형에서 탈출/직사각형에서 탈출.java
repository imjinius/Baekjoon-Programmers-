

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] nums = br.readLine().split(" ");
		int[] intArr = new int[4];
		
		intArr[0] = Integer.parseInt(nums[0]);
		intArr[1] = Integer.parseInt(nums[1]);
		intArr[2] = Integer.parseInt(nums[2])-Integer.parseInt(nums[0]);
		intArr[3] = Integer.parseInt(nums[3])-Integer.parseInt(nums[1]);
		
		Arrays.sort(intArr);
		
		System.out.println(intArr[0]);
	}
}
	
	
