import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] wordArr = br.readLine().toCharArray();
        br.close();

        int sum = 0;
        for (int i = 0; i < wordArr.length; i++) {
            if (wordArr[i] >= 'a' && wordArr[i] <= 'z') {
                sum += wordArr[i] - 96;
            } else {
                sum += wordArr[i] - 38;
            }
        }

        boolean checkPrimeNum = true;
        for (int j = 2; j < sum; j++) {
            if (sum % j == 0) {
                checkPrimeNum = false;
                break;
            }
        }

        if (checkPrimeNum) {
            System.out.print("It is a prime word.");
        } else {
            System.out.print("It is not a prime word.");
        }

    }

}