import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());
        char[] standard = new char[column];

        int countX = 0;
        int countDotRow = 0;
        int result = 0;

        if (row == 1) {
            char[] checkArr = br.readLine().toCharArray();
            for (int i = 0; i < column; i++) {
                if (checkArr[i] == '.') {
                    result++;
                }
            }
            System.out.print(result);
        } else if (column == 1) {
            for (int i = 0; i < row; i++) {
                char[] checkArr = br.readLine().toCharArray();
                for (int j = 0; j < column; j++) {
                    if (checkArr[j] == '.') {
                        result++;
                    }
                }
            }
            System.out.print(result);
        } else {
            for (int i = 0; i < row; i++) {
                char[] checkArr = br.readLine().toCharArray();
                for (int j = 0; j < column; j++) {
                    if (checkArr[j] == 'X') {
                        standard[j] = 'X';
                        countX++;
                    }
                }
                if (countX == 0) {
                    countDotRow++;
                } else {
                    countX = 0;
                }
            }

            for (int k = 0; k < standard.length; k++) {
                if (standard[k] == 0) {
                    result++;
                }
            }
            int max = Math.max(countDotRow, result);
            System.out.print(max);
        }

    }

}