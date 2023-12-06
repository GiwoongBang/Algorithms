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

        boolean isArithmetic = true;
        if ((nums[2] - nums[1]) != (nums[1] - nums[0])) {
            isArithmetic = false;
        }

        int nextNum;
        if (isArithmetic) {
            nextNum = nums[loop - 1] + ((nums[2] - nums[1]));
        } else {
            nextNum = nums[loop -1] * ((nums[2] / nums[1]));
        }
        System.out.print(nextNum);

    }

}