import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(cnt != 0){
			char[] temp = br.readLine().toCharArray();
			int check = 0;
			
			for(char a : temp) {
				if(check >= 0) {
				if(a == '(') {
					check += 1;
				}else if(a == ')'){
					check -= 1;
				}
				}else {
					break;
				}
			}
			
			if(check == 0)
				sb.append("YES").append("\n");
			else
				sb.append("NO").append("\n");
			
			cnt--;
		}
	
		System.out.println(sb);
	}
	
}