import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        br.close();

        if (A > B) {
            System.out.print(A * B / euclidean(A, B));
        } else if (A < B) {
            System.out.print(A * B / euclidean(B, A));
        } else {
            System.out.print(A);
        }
    }

    static long euclidean(long A, long B) {
        while (B != 0) {
            long R = A % B;
            A = B;
            B = R;
        }
        return A;
    }

}