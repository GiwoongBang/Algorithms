import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            BigInteger result = new BigInteger("0");
            int input = Integer.parseInt(br.readLine());
            for (int j = 0; j < input; j++) {
                BigInteger num = new BigInteger(br.readLine());
                result = result.add(num);
            }

            if(result.compareTo(BigInteger.ZERO) > 0) {
                bw.write("+\n");
            } else if(result.compareTo(BigInteger.ZERO) < 0) {
                bw.write("-\n");
            } else {
                bw.write("0\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();

    }

}