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
            int[] intArr = new int[a];
            IntStream.range(0, b).forEach(i -> {
                int[] basketRun;
                try {
                    basketRun = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                IntStream.range(basketRun[0] - 1, basketRun[1]).forEach(j -> {
                    intArr[j] = basketRun[2];
                });
            });

            String result = Arrays.stream(intArr)
                    .mapToObj(String::valueOf)
                            .collect(Collectors.joining(" "));

            System.out.println(result);
    }
}