import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        while (true) {
            if (X == 1) {
                System.out.print("1/1");
                break;
            } else if (X == 2) {
                System.out.print("1/2");
                break;
            } else {
                int startNum = 2;
                int preSum = 1;
                int nowSum = 3;
                boolean isFinish = false;

                for (int i = 3; i < 10000000; i++) {
                    if (X <= nowSum) {
                        int inputA = X - preSum;
                        int inputB = startNum - (X - preSum) + 1;

                        if (startNum % 2 == 0) {
                            System.out.print(inputA + "/" + inputB);
                            isFinish = true;
                            break;
                        } else {
                            System.out.print(inputB + "/" + inputA);
                            isFinish = true;
                            break;
                        }
                    } else {
                        preSum = nowSum;
                        startNum = i;
                        nowSum += i;
                    }
                }
                if (isFinish) break;
            }
        }
    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }
}