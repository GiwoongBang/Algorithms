import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(br.readLine());

        BigInteger result = BigInteger.ONE;
        if (n == BigInteger.ONE) {
            System.out.print(result);
        } else {
            result = n.multiply(BigInteger.valueOf(4));
            System.out.print(result);
        }

    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }
}