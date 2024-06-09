import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int numA = 0;
        int numB = 0;

        while (true) {
            st = new StringTokenizer(br.readLine());
            numA = Integer.parseInt(st.nextToken());
            numB = Integer.parseInt(st.nextToken());

            if (numA == 0 && numB == 0) break;

            if (numA >= numB) {
                if (numA % numB == 0) {
                    System.out.println("multiple");
                } else {
                    System.out.println("neither");
                }
            } else {
                if (numB % numA == 0) {
                    System.out.println("factor");
                } else {
                    System.out.println("neither");
                }
            }
        }
        
    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }
}