import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;


public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cases = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<Integer>();
		
		while(cases != 0){
			String order = br.readLine();
			
			switch (order) {
			case "pop":
				if(st.empty())
					bw.write(-1+"\n");
				else
					bw.write(st.pop()+"\n");
				break;
			case "size":
				bw.write(st.size()+"\n");
				break;
			case "empty":
				if(st.empty())
					bw.write(1+"\n");
				else
					bw.write(0+"\n");
				break;
			case "top":
				if(st.empty())
					bw.write(-1+"\n");
				else
					bw.write(st.peek()+"\n");
				break;

			default:
				int num = Integer.parseInt(order.split(" ")[1]);
				st.push(num);
				break;
			}
			
			cases--;
		}
		
		bw.flush();
		
	}
	
}