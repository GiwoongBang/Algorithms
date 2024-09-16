import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger apples = new BigInteger(br.readLine());
        BigInteger more = new BigInteger(br.readLine());

        BigInteger Natalia = (apples.subtract(more)).divide(BigInteger.valueOf(2));
        BigInteger Klaudia = apples.subtract(Natalia);

        System.out.println(Klaudia);
        System.out.print(Natalia);
    }

}
