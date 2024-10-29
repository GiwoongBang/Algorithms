import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            long N = Long.parseLong(br.readLine());
            long start = 0;
            long end = (long) Math.sqrt((2 * N - 1));

            long result = 0;
            while (start <= end) {
                long mid = (start + end) / 2;
                long sum = mid * (mid + 1) / 2;

                if (sum <= N) {
                    result = Math.max(mid, result);
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            System.out.println(result);
        }

    }

}