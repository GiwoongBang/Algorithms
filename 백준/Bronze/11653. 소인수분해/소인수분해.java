import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            System.out.print("");
        } else {
            int divide = 2;
            while (N != 1) {
                if (N % divide == 0) {
                    System.out.println(divide);
                    N /= divide;
                    divide = 2;
                } else {
                    divide++;
                }
            }
        }
    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }
}