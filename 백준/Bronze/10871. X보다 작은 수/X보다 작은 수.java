import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int sequenceCount = Integer.parseInt(input[0]);
        int num = Integer.parseInt(input[1]);

        int[] nums = new int[sequenceCount];

        String[] tempNums = br.readLine().split(" ");
        for (int i = 0; i < sequenceCount; i++) {
            nums[i] = Integer.parseInt(tempNums[i]);
        }
        br.close();

        for (int i = 0; i < nums.length; i++) {
            if (num > nums[i]) {
                bw.write(nums[i] + " ");
            }
        }
        bw.flush();
        bw.close();

    }

}