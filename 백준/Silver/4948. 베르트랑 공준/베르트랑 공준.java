import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int result = 0;

            int num = Integer.parseInt(br.readLine());
            if (num == 0) break;

            int doubleNum = num * 2;
            num += 1;
            while (num <= doubleNum) {
                if (num <= 2) {
                    result++;
                    num++;
                    continue;
                }

                long count = 0;
                for (long c = 2; c <= Math.sqrt(num); c++) {
                    if (num % c == 0) {
                        count++;
                        break;
                    }
                }

                if (count == 0) {
                    result++;
                }
                num++;
            }
            bw.write(result + "\n");
        }
        br.close();
        bw.flush();
        bw.close();

    }
}