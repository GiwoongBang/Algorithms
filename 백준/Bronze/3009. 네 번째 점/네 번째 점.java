import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int[] coordinateA = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());
        int[] coordinateB = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());
        int[] coordinateC = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};


        int x, y;
        if (coordinateA[0] == coordinateB[0]) {
            x = coordinateC[0];
        } else if (coordinateB[0] == coordinateC[0]) {
            x = coordinateA[0];
        } else {
            x = coordinateB[0];
        }

        if (coordinateA[1] == coordinateB[1]) {
            y = coordinateC[1];
        } else if (coordinateB[1] == coordinateC[1]) {
            y = coordinateA[1];
        } else {
            y = coordinateB[1];
        }

        System.out.print(x + " " + y);

    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }
}