import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; i++) {
            int k = Integer.parseInt(br.readLine());
            int result = 0;
            for (int j = 1; j <= k; j++) {
                int triangularSum = 0;
                for (int t = 1; t <= j + 1; t++) {
                    triangularSum += t;
                }
                result += j * triangularSum;
            }
            bw.write(result + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}