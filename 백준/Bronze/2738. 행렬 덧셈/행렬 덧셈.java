import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());
        int[][] result = new int[row][column];

        int[][] temp = new int[row * 2][column];
        for (int i = 0; i < row * 2; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            for (int j = 0; j < column; j++) {
                temp[i][j] = Integer.parseInt(str.nextToken());
            }
        }
        br.close();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = temp[i][j] + temp[i + row][j];
                bw.write(String.valueOf(result[i][j]) + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();

    }

}