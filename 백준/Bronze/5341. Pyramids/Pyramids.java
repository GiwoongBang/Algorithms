import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) break;

            if (input % 2 == 0) {
                sb.append((input + 1) * (input / 2)).append("\n");
            } else {
                sb.append(((input + 1) * (input / 2)) + ((input / 2) + 1)).append("\n");
            }
        }
        System.out.print(sb);
    }

}
