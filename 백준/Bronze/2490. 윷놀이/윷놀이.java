import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loop = 3;
        for (int i = 0; i < loop; i++) {
            int result = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int t = 0; t < 4; t++) {
                result += Integer.parseInt(st.nextToken());
            }

            if (result == 0) System.out.println("D");
            if (result == 1) System.out.println("C");
            if (result == 2) System.out.println("B");
            if (result == 3) System.out.println("A");
            if (result == 4) System.out.println("E");
        }

    }

}