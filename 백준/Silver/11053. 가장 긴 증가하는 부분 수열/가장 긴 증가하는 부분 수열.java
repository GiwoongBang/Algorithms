import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int A = Integer.parseInt(br.readLine());
        int[] seq = new int[A];
        int[] dp = new int[A];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < A; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < A; j++) {
            dp[j] = 1;

            for (int k = 0; k < j; k++) {
                if (seq[k] < seq[j] && dp[j] < dp[k] + 1) {
                    dp[j] = dp[k] + 1;
                }
            }
        }

        int max = -1;
        for (int r = 0; r < A; r++) {
            max = Math.max(dp[r], max);
        }
        System.out.print(max);

    }
}