import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] cups = {11, 2, 3};
        boolean isPresent = true;

        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()) - 1;
            int B = Integer.parseInt(st.nextToken()) - 1;

            if (A > 3 || B > 3) {
                isPresent = false;
                break;
            } else if (cups[A] >= 10) {
                cups[A] -= 10;
                cups[B] += 10;
            } else if (cups[B] >= 10) {
                cups[B] -= 10;
                cups[A] += 10;
            }
        }

        if (!isPresent) {
            System.out.print(-1);
        } else {
            for (int i = 0; i < 3; i++) {
                if (cups[i] >= 10) {
                    System.out.print(i + 1);
                    break;
                }
            }

        }

    }
}