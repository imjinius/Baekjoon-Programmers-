import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        //long b = Long.parseLong(input[1]);
        //long c= Long.parseLong(input[2]);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<(a/4);i++) {
            sb.append("long ");
        }
        System.out.println(sb.toString() + "int");
    }
}