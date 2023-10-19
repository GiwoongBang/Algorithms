import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int S1 = Integer.parseInt(st.nextToken());
        int S2 = Integer.parseInt(st.nextToken());
        int S3 = Integer.parseInt(st.nextToken());
        int[] intArr = new int[S1 + S2 + S3 - 2];

        for (int i = 1; i <= S1; i++) {
            for (int j = 1; j <= S2; j++) {
                for (int t = 1; t <= S3; t++) {
                    int sum = i + j + t;
                    intArr[sum - 3]++;
                }
            }
        }

        int max = 0;
        int result = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (max < intArr[i]) {
                max = intArr[i];
                result = i + 3;
            }
        }
        System.out.println(result);

    }

}