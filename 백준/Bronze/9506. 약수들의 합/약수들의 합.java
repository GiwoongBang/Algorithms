import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;

            List<Integer> divisors = new ArrayList<>();
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) divisors.add(i);
            }

            StringBuilder sb = new StringBuilder();
            sb.append(n + " = 1");

            int sum = 0;
            for (Integer divisor : divisors) {
                sum += divisor;
                if (divisor == 1) continue;
                sb.append(" + " + divisor);
            }

            if (sum > n || sum != n) {
                System.out.println(n + " is NOT perfect.");
            } else {
                System.out.println(sb);
            }
        }

    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }
}