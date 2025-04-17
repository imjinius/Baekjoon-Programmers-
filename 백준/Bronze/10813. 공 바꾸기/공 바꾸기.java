import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] basket = new int[a];
        for (int i = 0; i < a; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < b; i++) {
            st = new StringTokenizer(br.readLine());
            int idx1 = Integer.parseInt(st.nextToken()) - 1;
            int idx2 = Integer.parseInt(st.nextToken()) - 1;

            int temp = basket[idx1];
            basket[idx1] = basket[idx2];
            basket[idx2] = temp;
        }

        for (int i = 0; i < a; i++) {
            bw.write(basket[i] + (i == a - 1 ? "\n" : " "));
        }

        bw.flush();
        bw.close();
    }
}
