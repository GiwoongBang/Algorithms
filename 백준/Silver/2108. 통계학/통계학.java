import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int[] frequency = new int[8001];
        int maxCount = 0;

        int loop = Integer.parseInt(br.readLine());
        int[] nums = new int[loop];
        for (int i = 0; i < loop; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];

            frequency[nums[i] + 4000]++;
            if (frequency[nums[i] + 4000] > maxCount) maxCount = frequency[nums[i] + 4000];
        }
        br.close();

        int frequencyNum;
        List<Integer> frequencyNums = new ArrayList<>();
        for (int j = 0; j < frequency.length; j++) {
            if (frequency[j] == maxCount) {
                frequencyNums.add(j - 4000);
            }
        }
        Collections.sort(frequencyNums);
        if (frequencyNums.size() == 1) {
            frequencyNum = frequencyNums.get(0);
        } else {
            frequencyNum = frequencyNums.get(1);
        }

        Arrays.sort(nums);
        bw.write(Math.round((float)sum / loop) + "\n");
        bw.write(nums[loop / 2] + "\n");
        bw.write(frequencyNum + "\n");
        bw.write(nums[nums.length - 1] - nums[0] + "\n");

        bw.flush();
        bw.close();
    }
}