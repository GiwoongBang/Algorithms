import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int maxIdx = 0;
        int maxValue = 0;

        int[] lengths = new int[3];
        for (int i = 0; i < lengths.length; i++) {
            lengths[i] = Integer.parseInt(st.nextToken());
            if (lengths[i] > maxValue) {
                maxIdx = i;
                maxValue = lengths[i];
            }
        }

        int checkSum = 0;
        for (int j = 0; j < lengths.length; j++) {
            if (j == maxIdx) continue;
            checkSum += lengths[j];
        }

        if (maxValue >= checkSum) {
            maxValue = checkSum - 1;
        }
        System.out.print(checkSum + maxValue);
    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }
}