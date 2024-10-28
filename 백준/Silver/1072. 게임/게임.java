import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static long X;
    static long Y;
    static int target;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        target = (int) ((Y * 100) / X);

        if (target >= 99) {
            System.out.print(-1);
            return;
        }

        int left = 0;
        int right = 1000000000;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int Z = (int) (((Y + mid) * 100) / (X + mid));

            if (target >= Z) {
                result = mid + 1;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.print(result);
    }

}