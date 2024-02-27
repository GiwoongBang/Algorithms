import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 0; i < loop; i++) {
            for (int k = 0; k < loop; k++) {
                if (loop - i - 1 <= k) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int j = loop - 1; j > 0; j--) {
            for (int t = 0; t < loop; t++) {
                if (loop - j <= t) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}