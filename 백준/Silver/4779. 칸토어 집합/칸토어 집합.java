import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        String N;
        while ((N = br.readLine()) != null) {
            int n = Integer.parseInt(N);
            sb = new StringBuilder();

            int end = (int) Math.pow(3, n);
            for (int i = 0; i < end; i++) {
                sb.append("-");
            }

            recursion(sb, 0, end);
            System.out.println(sb);
        }

    }

    static void recursion(StringBuilder sb, int startIdx, int endIdx) {
        if (endIdx == 1) {
            return;
        }

        int threeDivisions = endIdx / 3;
        for (int i = startIdx + threeDivisions; i < startIdx + 2 * threeDivisions; i++) {
            sb.setCharAt(i, ' ');
        }

        recursion(sb, startIdx, threeDivisions);
        recursion(sb, startIdx + 2 * threeDivisions, threeDivisions);
    }

}