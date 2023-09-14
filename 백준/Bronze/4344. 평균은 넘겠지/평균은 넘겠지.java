import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int studentNum = Integer.parseInt(st.nextToken());
            int[] scores = new int[studentNum];
            int sum = 0;
            float average;
            int count = 0;
            float temp, result;

            for (int j = 0; j < studentNum; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
                sum += scores[j];
            }

            average = (float) sum / studentNum;

            for (int j = 0; j < studentNum; j++) {
                if (scores[j] > average) {
                    count++;
                }
            }
            temp = Math.round(((float) count / studentNum) * 100000);
            result = temp / 1000;
            bw.write(result + "%\n");

        }
        br.close();
        bw.flush();
        bw.close();

    }

}