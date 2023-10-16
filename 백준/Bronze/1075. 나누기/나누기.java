import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());
        br.close();

        N -= N % 100;

        while (true) {
            if (N % F == 0) {
                break;
            }
            N++;
        }

        int result = N % 100;
        System.out.printf("%02d", result);

    }

}