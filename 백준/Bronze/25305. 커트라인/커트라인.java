import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

        String[] strArr = br.readLine().split(" ");
        Integer[] scorePcs = new Integer[Integer.parseInt(strArr[0])];
        String[] score = br.readLine().split(" ");
        
        for(int i=0;i<score.length;i++)
        	scorePcs[i] = Integer.parseInt(score[i]);
        
        Arrays.sort(scorePcs,Collections.reverseOrder());
        System.out.println(scorePcs[Integer.parseInt(strArr[1])-1]);
        
	}
	
}