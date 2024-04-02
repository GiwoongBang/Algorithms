import java.io.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger bigN = BigInteger.valueOf(n);
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;

        if (bigN.equals(second)) {
            System.out.print(second);
        } else {
            BigInteger result = BigInteger.ZERO;
            for (int i = 2; i <= n; i++) {
                result = first.add(second);
                first = second;
                second = result;
            }
            System.out.print(result);
        }

    }
}