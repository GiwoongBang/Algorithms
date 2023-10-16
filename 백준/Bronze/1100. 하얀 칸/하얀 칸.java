import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 0, 2, 4, 6 번째 줄은 0, 2, 4, 6 번째에 F 체크
        // 1, 3, 5, 7 번째 줄은 1, 3, 5, 7 번째에 F 체크

        int count = 0;

        for (int i = 0; i < 8; i++) {
            char[] chessboard = br.readLine().toCharArray();
            if (i % 2 == 0) {
                for (int j = 0; j < 4; j++) {
                    if (chessboard[2 * j] == 'F') {
                        count++;
                    }
                }
            } else {
                for (int j = 0; j < 4; j++) {
                    if (chessboard[(2 * j) + 1] == 'F') {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

}