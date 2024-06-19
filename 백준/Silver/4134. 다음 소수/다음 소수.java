import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long loop = Integer.parseInt(br.readLine());
        for (long i = 0; i < loop; i++) {
            long num = Long.parseLong(br.readLine());

            while (true) {
                long count = 0;
                for (long c = 2; c <= Math.sqrt(num); c++) {
                    if (num % c == 0) {
                        count++;
                        break;
                    }
                }

                if (count == 0) {
                    if (num <= 2) num = 2;
                    bw.write(num + "\n");
                    break;
                }
                num++;
            }
        }
        br.close();
        bw.flush();
        bw.close();

    }
}