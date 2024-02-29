import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());

        for (int i = 0; i < loop; i++) {
            br.readLine();
            int students = Integer.parseInt(br.readLine());
            BigInteger candies = BigInteger.ZERO;
            for (int k = 0; k < students; k++) {
                candies = candies.add(BigInteger.valueOf(Long.parseLong(br.readLine())));
            }

            if (candies.mod(BigInteger.valueOf(students)).equals(BigInteger.ZERO)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}