import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        int loop = 5;
        for (int i = 0; i < loop; i++) {
            sum += Math.pow(Integer.parseInt(st.nextToken()), 2);
        }

        int result = sum % 10;
        System.out.print(result);

    }

}