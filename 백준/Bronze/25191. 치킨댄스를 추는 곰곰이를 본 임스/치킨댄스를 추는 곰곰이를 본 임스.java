import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int chicken = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cola = Integer.parseInt(st.nextToken());
		int beer = Integer.parseInt(st.nextToken());
		
		int result = 0;
		
		while(chicken > 0){
			if(cola > 1){
				chicken--;
				cola -= 2;
				result++;
			} else {
				chicken--;
				beer--;
				result++;
				if(cola <= 1 && beer == 0){
					break;
				}
			}
		}
		
		System.out.println(result);
	}
}