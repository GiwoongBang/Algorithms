import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] splitedStr = br.readLine().split("-");

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < splitedStr.length; i++) {
            char[] strArr = splitedStr[i].toCharArray();
            result.append(strArr[0]);
        }

        System.out.print(result);
    }
}