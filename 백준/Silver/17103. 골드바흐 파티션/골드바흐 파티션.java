import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] notPrimeNum = new boolean[1000001];
        notPrimeNum[0] = notPrimeNum[1] = true;
        for (int i = 2; i * i <= 1000000; i++) {
            if (!notPrimeNum[i]) {
                for (int j = i * i; j <= 1000000; j += i) {
                    notPrimeNum[j] = true;
                }
            }
        }

        int loop = Integer.parseInt(br.readLine());
        for (int k = 0; k < loop; k++) {
            int result = 0;

            int num = Integer.parseInt(br.readLine());
            int innerLoop = num / 2;
            for (int s = 2; s <= innerLoop; s++) {
                if (!notPrimeNum[s] && !notPrimeNum[num - s]) result++;
            }
            bw.write(result + "\n");
        }
        br.close();
        bw.flush();
        bw.close();

    }
}