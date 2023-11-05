import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] numArr = br.readLine().toCharArray();
        br.close();

        String result = "NO";

        if (numArr.length < 2) {
            System.out.print(result);
        } else {
            for (int i = 0; i < numArr.length; i++) {
                int left = 1, right = 1;

                for (int j = 0; j <= i; j++) {
                    left *= numArr[j] - 48;
                }
                for (int k = i + 1; k < numArr.length; k++) {
                    right *= numArr[k] - 48;
                }

                if (left == right) {
                    result = "YES";
                    System.out.print(result);
                    break;
                }
            }
            if (!result.equals("YES")) {
                System.out.print(result);
            }
        }

    }

}