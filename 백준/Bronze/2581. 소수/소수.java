import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int minValue = N;
        for (int i = M; i <= N; i++) {
            boolean isDecimal = true;

            if (i == 1) isDecimal = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isDecimal = false;
                    break;
                }
            }

            if(isDecimal) {
                sum += i;
                if(minValue > i) minValue = i;
            }
        }
        if (sum == 0) {
            System.out.print(-1);
        } else {
            System.out.println(sum);
            System.out.print(minValue);
        }


    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }
}