import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeMap;


public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int[] index = new int[5];
		
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for(int i=1;i<=8;i++)
			map.put(Integer.parseInt(br.readLine()), i);
		
		for(int i=1;i<=5;i++){
			sum += map.lastKey();
			index[i-1] = map.get(map.lastKey());
			map.remove(map.lastKey());
		}
		
		System.out.println(sum);
		Arrays.sort(index);
		for(int i:index)
			System.out.print(i+" ");
		
	}
	
}