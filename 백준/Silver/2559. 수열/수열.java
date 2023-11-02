import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int nums = Integer.parseInt(st.nextToken());
        int interval = Integer.parseInt(st.nextToken());

        int[] numArray = new int[nums];
        int loop = nums - interval;

        int sum = 0;
        StringTokenizer stSecond = new StringTokenizer(br.readLine());
        br.close();
        for (int i = 0; i < nums; i++) {
            numArray[i] = Integer.parseInt(stSecond.nextToken());
        }

        for (int j = 0; j < interval; j++) {
            sum += numArray[j];
        }
        int maxSum = sum;

        int minIndex = 0;
        int addIndex = interval;
        for (int k = 0; k < loop; k++) {
            sum -= numArray[minIndex];
            sum += numArray[addIndex];

            if (sum > maxSum) maxSum = sum;

            minIndex++;
            addIndex++;
        }
        System.out.print(maxSum);

    }

}