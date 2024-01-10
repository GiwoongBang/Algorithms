import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) break;

            while (true) {
                int sum = 0;
                while (N != 0) {
                    int rest = N % 10;
                    N /= 10;
                    sum += rest;
                }

                if (sum < 10) {
                    System.out.println(sum);
                    break;
                } else {
                    N = sum;
                }
            }

        }

    }

}