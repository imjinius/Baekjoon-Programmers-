
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int[] basket = IntStream.rangeClosed(1, a).toArray();

        for(int i=0;i<b;i++) {
            String[] change = br.readLine().split(" ");
            int idx1 = Integer.parseInt(change[0]) - 1;
            int idx2 = Integer.parseInt(change[1]) - 1;

            int temp = basket[idx1];
            basket[idx1] = basket[idx2];
            basket[idx2] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<basket.length; i++){
            sb.append(basket[i]);
            if (i != basket.length - 1) sb.append(" ");
        }

        System.out.println(sb);

    }
}