import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;
        int[] nums = new int[3];
        int participants = Integer.parseInt(br.readLine());
        for (int i = 0; i < participants; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                nums[j] = Integer.parseInt(st.nextToken());
            }

            int duplicated = 0;
            for (int k = 0; k < 2; k++) {
                for (int t = k + 1; t < 3; t++) {
                    if (nums[k] == nums[t]) duplicated++;
                }
            }

            if (duplicated == 3) {
                int prize = 10000 + (nums[0] * 1000);
                result = checkMaxPrize(result, prize);
            }

            if (duplicated == 1) {
                int max = findMaxValue(nums);
                int prize = 1000 + (max * 100);
                result = checkMaxPrize(result, prize);
            }

            if (duplicated == 0) {
                int max = findMaxValue(nums);
                int prize = max * 100;
                result = checkMaxPrize(result, prize);
            }
        }
        System.out.print(result);

    }

    private static int checkMaxPrize(int result, int prize) {
        if(prize > result) result = prize;
        return result;
    }

    private static int findMaxValue(int[] nums) {
        int max = Math.max(nums[0], nums[1]);
        max = Math.max(max, nums[2]);
        return max;
    }

}