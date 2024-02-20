import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;
        int dice = 4;
        int[] nums = new int[dice];

        int participants = Integer.parseInt(br.readLine());
        for (int i = 0; i < participants; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < dice; j++) {
                nums[j] = Integer.parseInt(st.nextToken());
            }

            int duplicated = 0;
            int numA = 0;
            int numB = 0;
            for (int k = 0; k < dice - 1; k++) {
                for (int t = k + 1; t < dice; t++) {
                    if (nums[k] == nums[t]) {
                        duplicated++;
                        if (numA == 0) {
                            numA = nums[k];
                        } else if (numA != nums[k]) {
                            numB = nums[k];
                        }
                    }
                }
            }

            if (duplicated == 6) {
                int prize = 50000 + (numA * 5000);
                result = checkMaxPrize(result, prize);
            }

            if (duplicated == 3) {
                int prize = 10000 + (numA * 1000);
                result = checkMaxPrize(result, prize);
            }

            if (duplicated == 2) {
                int prize = (2000 + (numA * 500)) + (numB * 500);
                result = checkMaxPrize(result, prize);
            }

            if (duplicated == 1) {
                int prize = 1000 + (numA * 100);
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
        if (prize > result) result = prize;
        return result;
    }

    private static int findMaxValue(int[] nums) {
        int max = Math.max(nums[0], nums[1]);
        for (int m = 2; m < nums.length; m++) {
            max = Math.max(max, nums[m]);
        }

        return max;
    }

}