import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        BigInteger result = factorial(N);

        System.out.print(result);

    }

    static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}