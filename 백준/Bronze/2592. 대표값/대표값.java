import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
10
40
30
60
30
20
60
30
40
50

37 평균 average
30 최빈 frequent
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(nums);

        int average = nums[0];
        int frequent = nums[0];
        int maxCount = 1;

        int nowCount = 1;
        for (int j = 1; j < nums.length; j++) {
            average += nums[j];
            if (nums[j] == nums [j - 1]) {
                nowCount++;
            } else {
                if (nowCount > maxCount) {
                    frequent = nums[j-1];
                    maxCount = nowCount;
                    nowCount = 1;
                }
            }
        }
        if(nowCount > maxCount) frequent = nums[9];
        average /= 10;

        System.out.println(average);
        System.out.print(frequent);
    }

}