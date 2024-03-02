import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loop = 5;
        int sum = 0;

        int[] nums = new int[loop];
        for (int i = 0; i < loop; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];
        }
        Arrays.sort(nums);

        int avg = sum / loop;
        int mid = nums[loop / 2];

        System.out.println(avg);
        System.out.print(mid);
    }

}