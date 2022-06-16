import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
	public static int d(int number){
		int sum = number;
		
		while(number != 0){
			sum  += (number%10);
			number /= 10;
		}
		
		return sum;
	}

	public static void main(String[] args) throws IOException {
        
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] bl = new boolean[10001];

		for(int i=1;i<10001;i++){
			
			int index = Main.d(i);
			if(index<10000)
				bl[index] = true;
		}
			
		for(int i=1;i<10000;i++){
			if(!bl[i]==true){
				bw.write(Integer.toString(i));
				bw.newLine();
			}
		}
		
		bw.close();
	}

}

