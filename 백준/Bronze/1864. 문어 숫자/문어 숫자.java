import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] characterTable = new char[]{'-', '\\', '(', '@', '?', '>', '&', '%'};

        while (true) {
            char[] charArr = br.readLine().toCharArray();

            if (charArr[0] == '#') {
                break;
            } else {
                int pow = charArr.length - 1;

                int result = 0;
                for (int i = 0; i < charArr.length; i++) {
                    boolean charCheck = false;

                    for (int j = 0; j < characterTable.length; j++) {
                        if (charArr[i] == characterTable[j]) {
                            charCheck = true;
                            result += j * Math.pow(8, pow);
                            pow--;
                            break;
                        }
                    }

                    if (!charCheck) {
                        result += -1 * Math.pow(8, pow);
                        pow--;
                    }
                }
                System.out.println(result);
            }
        }

    }

}