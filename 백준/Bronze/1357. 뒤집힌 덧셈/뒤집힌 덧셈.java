import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] charArrX = st.nextToken().toCharArray();
        char[] charArrY = st.nextToken().toCharArray();
        br.close();

        char[] revArrX = new char[charArrX.length];
        char[] revArrY = new char[charArrY.length];

        intToRev(charArrX, revArrX);
        intToRev(charArrY, revArrY);

        int X = revToInt(revArrX);
        int Y = revToInt(revArrY);

        String sum = String.valueOf((X + Y));
        char[] sumArr = sum.toCharArray();
        char[] resultArr = new char[sumArr.length];

        intToRev(sumArr, resultArr);
        int result = revToInt(resultArr);

        System.out.print(result);

    }

    private static void intToRev(char[] charArr, char[] revArr) {
        int index = 0;
        for (int i = charArr.length - 1; i >= 0; i--) {
                revArr[index] = charArr[i];
                index++;
        }
    }

    private static int revToInt(char[] revArr) {
        String tempNum = new String(revArr);
        int intNum = Integer.parseInt(tempNum);

        return intNum;
    }

}