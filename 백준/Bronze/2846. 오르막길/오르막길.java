import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        int[] slopes = new int[loop];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < loop; i++) {
            slopes[i] = Integer.parseInt(st.nextToken());
        }

        int maxSlope = 0;
        int nowSlopes = 0;
        int now = slopes[0];
        for (int j = 1; j < loop; j++) {
            if (slopes[j] > now) {
                nowSlopes += slopes[j] - slopes[j - 1];
                now = slopes[j];
            } else {
                if (nowSlopes > maxSlope) maxSlope = nowSlopes;
                nowSlopes = 0;
                now = slopes[j];
            }
        }
        if (nowSlopes > maxSlope) maxSlope = nowSlopes;
        System.out.print(maxSlope);
    }
}