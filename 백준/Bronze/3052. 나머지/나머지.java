import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		boolean bl;
		
		int result = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt()%42;
		}
		
		for(int i = 0;i < a.length;i++){
			bl = false;
			for (int j = i+1; j < a.length; j++) {
				if(a[i] == a[j]){
					bl = true;
					break;
                    }
			}
			
			if(bl == false){
				result++;
			}
		}
		System.out.println(result);
	}

}
