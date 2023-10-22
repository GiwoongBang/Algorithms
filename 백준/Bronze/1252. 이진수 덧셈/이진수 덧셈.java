import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String binaryA = st.nextToken();
        String binaryB = st.nextToken();

        BigInteger decimalA = new BigInteger(binaryA, 2);
        BigInteger decimalB = new BigInteger(binaryB, 2);

        BigInteger addValue = decimalA.add(decimalB);
        String binarySum = addValue.toString(2);
        System.out.println(binarySum);

    }

}