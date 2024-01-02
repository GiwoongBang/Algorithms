import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        long result = 5;
        if (N >= 2) {
            for (int i = 2; i <= N; i++) {
                result += ((i + 1) * 3) - 2;
            }
        }

        result %= 45678;
        System.out.print(result);

    }

}