import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] a = new int[9];
		int seq = 0;
		
		for (int i = 0; i < 9; i++) {
			a[i] = sc.nextInt();
		}
		
		int max = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if(max < a[i]){
				max = a[i];
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			if(max == a[i])
				seq = i+1;
		}
		
		System.out.println(max);
		System.out.println(seq);
		
	}
}
