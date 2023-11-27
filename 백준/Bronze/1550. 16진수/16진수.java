import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String hexNum = br.readLine();
        BigInteger decimalNum = new BigInteger(hexNum, 16);

        System.out.print(decimalNum);

    }
}