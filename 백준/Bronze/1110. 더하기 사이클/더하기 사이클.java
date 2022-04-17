import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 2;
		int newNum = 0;
		int remain = num % 10;

		int result = (num / 10) + remain;
		int next = result % 10;
		result = remain + next;
		
		while(num != newNum){
		result = (result % 10) + next;
		next = result - next;
		newNum = (next*10) + (result%10);
		count ++;
			}
        
		if(num != 0){
		System.out.println(count);
		}else
			System.out.println(1);
		
	}

}
