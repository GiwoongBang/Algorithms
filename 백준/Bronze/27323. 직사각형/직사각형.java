import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int width = Integer.parseInt(br.readLine());
        int height = Integer.parseInt(br.readLine());

        System.out.print(width * height);
    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }
}