import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int resultSum = 0;
        int nowSum = 0;

        int loop = 10;
        for (int i = 0; i < loop; i++) {
            int now = Integer.parseInt(br.readLine());
            nowSum += now;

            if (Math.abs(100 - resultSum) >= Math.abs(100 - nowSum)) {
                resultSum = nowSum;
            } else {
                break;
            }
        }
        System.out.print(resultSum);
    }
}