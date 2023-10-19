import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        String numA = st.nextToken();
        String numB = st.nextToken();
        long sum = 0;

        for (int i = 0; i < numA.length(); i++) {
            for (int j = 0; j < numB.length(); j++) {
                sum += (long) (numA.charAt(i) - '0') * (numB.charAt(j) - '0');
            }
        }
        System.out.print(sum);

    }

}