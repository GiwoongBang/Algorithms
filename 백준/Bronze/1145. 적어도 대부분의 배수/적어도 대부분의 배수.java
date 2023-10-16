import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];
        int count = 0;
        int N = 3;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while (true) {
            N++;
            for (int j : arr) {
                if (N >= j && N % j == 0) {
                    count++;
                }
            }

            if (count >= 3) {
                break;
            }
            count = 0;
        }
        System.out.println(N);
    }

}