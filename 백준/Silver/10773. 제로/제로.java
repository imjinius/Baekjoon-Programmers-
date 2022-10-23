import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int num = 0;
		int sum = 0;
		Stack<Integer> st = new Stack<>();
		
		while(cnt != 0){
			num = Integer.parseInt(br.readLine());
			if(num == 0)
				st.pop();
			else
				st.add(num);
			cnt--;
		}
		
		for(int i:st)
			sum+=i;
		
		System.out.println(sum);
		
	}
	
}