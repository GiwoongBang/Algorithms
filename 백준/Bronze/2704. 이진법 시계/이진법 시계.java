import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; i++) {
            StringBuilder colTime = new StringBuilder();
            StringBuilder rowTime = new StringBuilder();

            String[] strTimes = br.readLine().split(":");
            int[] deciTimes = new int[strTimes.length];
            for (int j = 0; j < deciTimes.length; j++) {
                deciTimes[j] = Integer.parseInt(strTimes[j]);
            }

            int[][] biTimes = new int[6][deciTimes.length];
            for (int k = 0; k < deciTimes.length; k++) {

                int index = 0;
                for (int t = 5; t >= 0; t--) {
                    if (deciTimes[k] - (int) Math.pow(2, t) >= 0) {
                        deciTimes[k] -= (int) Math.pow(2, t);
                        biTimes[index][k] = 1;
                    } else {
                        biTimes[index][k] = 0;
                    }
                    index++;
                }
            }

            for (int c1 = 0; c1 < 6; c1++) {
                for (int r1 = 0; r1 < deciTimes.length; r1++) {
                    colTime.append(biTimes[c1][r1]);
                }
            }

            for (int r2 = 0; r2 < deciTimes.length; r2++) {
                for (int c2 = 0; c2 < 6; c2++) {
                    rowTime.append(biTimes[c2][r2]);
                }
            }

            System.out.println(colTime + " " + rowTime);
        }
    }
}