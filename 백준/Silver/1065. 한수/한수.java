import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());
        br.close();

        int count = 0;
        for (int i = 1; i <= loop; i++) {

            if (i > 0 && i < 100)
                count++;

            if (i >= 100 && i < 1000) {
                int[] nums = new int[3];
                int num = i;
                for (int j = 0; j < 3; j++) {
                    nums[j] = num % 10;
                    num = num / 10;
                }

                if ((nums[0] - nums[1]) == (nums[1] - nums[2])) {
                    count++;
                }
            }

        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}