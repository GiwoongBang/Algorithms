import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        br.close();

        int minIndex = 0;
        int min = 0;

        while (min < M) {
            ++minIndex;
            int square = minIndex * minIndex;
            if (square >= M && square <= N) {
                min = square;
                break;
            }

            if (square > N) {
                break;
            }
        }

        if (min == 0) {
            System.out.print(-1);
        } else {
            int sum = min;
            while (true) {
                ++minIndex;
                int square = minIndex * minIndex;
                if (square <= N) {
                    sum += square;
                } else {
                    break;
                }
            }
            System.out.println(sum);
            System.out.print(min);
        }

    }

}