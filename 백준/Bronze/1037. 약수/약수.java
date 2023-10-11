import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputsNum = Integer.parseInt(br.readLine());

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < inputsNum; i++) {
            int num = Integer.parseInt(st.nextToken());
            maxValue = Math.max(maxValue, num);
            minValue = Math.min(minValue, num);
        }
        System.out.println(maxValue * minValue);

    }

}