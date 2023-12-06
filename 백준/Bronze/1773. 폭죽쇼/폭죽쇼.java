import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int students = Integer.parseInt(st.nextToken());
        int times = Integer.parseInt(st.nextToken());

        int[] runningTime = new int[times];
        for (int i = 0; i < students; i++) {
            int cycle = Integer.parseInt(br.readLine());
            int tempCycle = cycle;
            int multiple = 1;
            while (true) {
                if (tempCycle <= times) {
                    runningTime[tempCycle - 1]++;
                    multiple++;
                    tempCycle = cycle * multiple;
                } else {
                    break;
                }
            }
        }

        int count = 0;
        for (int j = 0; j < runningTime.length; j++) {
            if (runningTime[j] > 0) {
                count++;
            }
        }
        System.out.print(count);

    }

}