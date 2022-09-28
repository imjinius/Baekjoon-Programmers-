import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

        int num = Integer.parseInt(br.readLine());
        int num2 = 1;
        int cnt = 1;
        
        if(num == 1)
        	System.out.println(1);
        else {
        	while(num2<num){
        		num2 = num2 + (cnt*6);
        		cnt++;
        	}
        	System.out.println(cnt);
        }

		
	}
	
}