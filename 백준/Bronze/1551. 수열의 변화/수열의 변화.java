import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numsCount = Integer.parseInt(st.nextToken());
        int loop = Integer.parseInt(st.nextToken());

        String[] numsTempElement = br.readLine().split(",");
        int[] nums = new int[numsCount];
        for (int i = 0; i < numsCount; i++) {
            nums[i] = Integer.parseInt(numsTempElement[i]);
        }

        if (loop == 0) {
            for (int t = 0; t < nums.length; t++) {
                if (t < nums.length - 1) {
                    System.out.print(nums[t] + ",");
                } else {
                    System.out.print(nums[t]);
                }
            }
        } else {
            for (int j = 0; j < loop; j++) {
                if (j < loop - 1) {
                    numsCount--;
                    for (int k = 0; k < numsCount; k++) {
                        nums[k] = nums[k + 1] - nums[k];
                    }
                } else {
                    numsCount--;
                    for (int k = 0; k < numsCount; k++) {
                        if (k < numsCount - 1) {
                            nums[k] = nums[k + 1] - nums[k];
                            System.out.print(nums[k] + ",");
                        } else {
                            nums[k] = nums[k + 1] - nums[k];
                            System.out.print(nums[k]);
                        }
                    }
                }
            }
        }

    }

}