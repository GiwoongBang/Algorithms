import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        br.close();

        if (num == 0) {
            bw.write(String.valueOf(0));
        } else if (num == 1) {
            bw.write(String.valueOf(1));
        } else {
            int[] nums = new int[num + 1];
            nums[0] = 0;
            nums[1] = 1;

            for (int i = 2; i < num + 1; i++) {
                nums[i] = nums[i - 2] + nums[i - 1];
            }
            bw.write(String.valueOf(nums[num]));
        }
        bw.flush();
        bw.close();

    }

}