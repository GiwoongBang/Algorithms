import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean isEquilateral = true;
        int sum = 0;
        int[] angles = new int[3];
        for (int i = 0; i < 3; i++) {
            int angle = Integer.parseInt(br.readLine());
            sum += angle;
            angles[i] = angle;
            if (angle != 60) isEquilateral = false;
        }

        if (isEquilateral) {
            System.out.print("Equilateral");
        } else if (sum != 180) {
            System.out.print("Error");
        } else {
            boolean sameCase = false;
            for (int t = 0; t < 2; t++) {
                for (int s = t + 1; s < 3; s++) {
                    if (angles[t] == angles[s]) {
                        sameCase = true;
                        break;
                    }
                }
                if (sameCase) break;
            }

            if (sameCase) {
                System.out.print("Isosceles");
            } else {
                System.out.print("Scalene");
            }
        }

    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }
}