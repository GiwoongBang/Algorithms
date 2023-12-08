import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] stringA = br.readLine().toCharArray();
        char[] stringB = br.readLine().toCharArray();

        for (int i = 0; i < stringA.length; i++) {
            for (int j = 0; j < stringB.length; j++) {
                if (stringA[i] == stringB[j]) {
                    stringA[i] -= stringA[i];
                    stringB[j] -= stringB[j];
                    break;
                }
            }
        }

        int count = 0;
        for (char eachChar : stringA) {
            if (eachChar >= 'a' && eachChar <= 'z') {
                count++;
            }
        }

        for (char eachChar : stringB) {
            if (eachChar >= 'a' && eachChar <= 'z') {
                count++;
            }
        }
        System.out.print(count);

    }

}