
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

            IntStream.range(0, b).forEach(i -> {
                try {
                        int[] change = Arrays.stream(br.readLine().split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray();

                        int temp = basket[change[0] - 1];
                        basket[change[0] - 1] = basket[change[1] - 1];
                        basket[change[1] - 1] = temp;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
            });

            String result = Arrays.stream(basket)
                    .mapToObj(String::valueOf)
                            .collect(Collectors.joining(" "));

            System.out.println(result);
    }
}