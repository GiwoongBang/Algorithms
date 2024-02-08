import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int K = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] numArr = new int[N];
        for (int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(st2.nextToken());
        }

        int result = 0;
        for (int j = 0; j < N - K + 1; j++) {
            int sum = 0;
            for (int t = 0; t < K; t++) {
                sum += numArr[j + t];
                if(j == 0) result = sum;
            }

            if(sum > result) result = sum;
        }
        System.out.print(result);

    }

}