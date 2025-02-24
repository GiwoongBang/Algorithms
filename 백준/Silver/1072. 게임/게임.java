import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        int result = -1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long X = Integer.parseInt(st.nextToken());
        long Y = Integer.parseInt(st.nextToken());
        int winningRate = (int) (Y * 100 / X);

        if (winningRate >= 99) {
            System.out.println(result);

            return;
        }

        int left = 0;
        int right = 1000000000;

        while (left <= right) {
            int mid = (left + right) / 2;
            int nowWinningRate = (int) (((Y + mid) * 100) / (X + mid));

            if (winningRate >= nowWinningRate) {
                result = mid + 1;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.print(result);
    }

}