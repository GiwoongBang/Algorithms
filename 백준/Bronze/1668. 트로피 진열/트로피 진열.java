import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(br.readLine());

        int[] nums = new int[loop];
        for (int i = 0; i < loop; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        int left = 1;
        int leftMax = nums[0];
        for (int j = 0; j < loop - 1; j++) {
            if (leftMax < nums[j + 1]) {
                left++;
                leftMax = nums[j + 1];
            }
        }

        int right = 1;
        int rightMax = nums[loop - 1];
        for (int k = loop - 1; k > 0; k--) {
            if (rightMax < nums[k - 1]) {
                right++;
                rightMax = nums[k - 1];
            }
        }
        System.out.print(left + "\n" + right);

    }

}