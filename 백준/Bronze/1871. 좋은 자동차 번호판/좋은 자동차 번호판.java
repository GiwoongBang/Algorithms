import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(br.readLine());

        for (int i = 0; i < loop; i++) {
            int stringSum = 0;
            int multiple = 2;
            char[] carNumArr = br.readLine().toCharArray();
            for (int j = 0; j < 3; j++) {
                stringSum += (carNumArr[j] - 'A') * Math.pow(26, multiple);
                multiple--;
            }

            StringBuilder rightNum = new StringBuilder();
            for (int k = 4; k < 8; k++) {
                rightNum.append(carNumArr[k]);
            }
            int intSum = Integer.parseInt(String.valueOf(rightNum));

            int difference = Math.abs(stringSum - intSum);

            if (difference <= 100) {
                System.out.println("nice");
            } else {
                System.out.println("not nice");
            }
        }


    }

}