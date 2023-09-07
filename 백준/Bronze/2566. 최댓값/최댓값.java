import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int row = 0;
        int column = 0;

        int max = 0;
        int[] array = new int[9];
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                array[j] = Integer.parseInt(st.nextToken());
                if (array[j] > max) {
                    max = array[j];
                    row = i;
                    column = j;
                }
            }
        }
        br.close();

        bw.write(String.valueOf(max) + "\n");
        bw.write((row + 1) + " " + (column + 1));
        bw.flush();
        bw.close();

    }

}