import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        long sum = 0;
        for (int j = 0; j < nums.length - 1; j++) {
            for (int t = j + 1; t < nums.length; t++) {
                sum += Math.abs(nums[j] - nums[t]);
            }
        }
        System.out.print(sum * 2);

    }

}