import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

        int total = Integer.parseInt(br.readLine());
        int cnt = Integer.parseInt(br.readLine());
        int price = 0;
        
        while(cnt>0){
        	String[] s = br.readLine().split(" ");
        	price += Integer.parseInt(s[0])*Integer.parseInt(s[1]);
        	cnt--;
        }
        
        if(price == total)
        	System.out.println("Yes");
        else
        	System.out.println("No");
        

		
	}
	
}