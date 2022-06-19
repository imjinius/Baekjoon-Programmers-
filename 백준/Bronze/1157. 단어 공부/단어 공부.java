import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = br.readLine().split("");
		char[] charArr = new char[arr.length];
		StringBuffer sb = new StringBuffer();
		int[] numArr = new int[26];
		int max = 0;
		int maxIndex = 0;
		char result = 0;
	
		for(int i=0;i<numArr.length;i++)
			numArr[i] = 0;
		
		
		for(int i=0;i<arr.length;i++){
			sb.append(arr[i].toLowerCase());
		}
		
		charArr = sb.toString().toCharArray();
		
		for(int i=0;i<charArr.length;i++){
			for(int j=0;j<numArr.length;j++){
				if((charArr[i]-97) == j){
					numArr[j]++;
				}
			}
		}
		
		
		for(int i=0;i<numArr.length;i++){
			if(maxIndex<numArr[i]){
				maxIndex = numArr[i];
				max = i+97;
			} 
		}
		
		int cnt = 0;
		for(int i=0;i<numArr.length;i++){
			if(numArr[i]==maxIndex){
				cnt++;
				if(cnt > 1){
					System.out.println("?");
					break;
				} 
			}
		}
		
		if(cnt < 2){
			result = (char) max;
			System.out.println(Character.toString(result).toUpperCase());
		}
		
		br.close();

	}


}
