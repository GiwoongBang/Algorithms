import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            boolean exit = false;
            st = new StringTokenizer(br.readLine());
            int[] lengths = new int[3];
            for (int i = 0; i < 3; i++) {
                int length = Integer.parseInt(st.nextToken());
                if (length == 0) {
                    exit = true;
                    break;
                }
                lengths[i] = length;
            }
            if (exit) break;

            int max = Integer.MIN_VALUE;
            int idx = 0;
            for (int j = 0; j < 3; j++) {
                if (lengths[j] > max) {
                    max = lengths[j];
                    idx = j;
                }
            }

            int checkSum = 0;
            for (int m = 0; m < 3; m++) {
                if (m == idx) continue;
                checkSum += lengths[m];
            }
            if (max >= checkSum) {
                System.out.println("Invalid");
            } else {
                int sameCount = 0;
                for (int t = 0; t < 2; t++) {
                    for (int s = t + 1; s < 3; s++) {
                        if (lengths[t] == lengths[s]) sameCount++;
                    }
                }

                if (sameCount == 3) System.out.println("Equilateral");
                if (sameCount == 1) System.out.println("Isosceles");
                if (sameCount == 0) System.out.println("Scalene");
            }
        }

    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }
}