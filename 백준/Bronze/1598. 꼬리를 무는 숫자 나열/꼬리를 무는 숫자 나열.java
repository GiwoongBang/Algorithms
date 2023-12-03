import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numA = Integer.parseInt(st.nextToken());
        int numB = Integer.parseInt(st.nextToken());
        br.close();

        int verticalA = verticalCheck(numA);
        int verticalB = verticalCheck(numB);
        int horizonA = horizonCheck(numA);
        int horizonB = horizonCheck(numB);

        int result = 0;
        if (verticalA >= verticalB) {
            result += verticalA - verticalB;
        } else {
            result += verticalB - verticalA;
        }

        if (horizonA >= horizonB) {
            result += horizonA - horizonB;
        } else {
            result += horizonB - horizonA;
        }

        System.out.print(result);
    }

    private static int verticalCheck(int num) {
        if (num % 4 == 0) {
            return 4;
        } else {
            return num % 4;
        }
    }

    private static int horizonCheck(int num) {
        if (num % 4 == 0) {
            return num / 4;
        } else {
            return (num / 4) + 1;
        }
    }

}