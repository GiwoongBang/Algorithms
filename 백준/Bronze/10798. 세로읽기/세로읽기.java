import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int maxLength = 0;
        char[][] result = new char[5][15];

        for (int i = 0; i < 5; i++) {
            char[] charArray = br.readLine().toCharArray();
            maxLength = Math.max(maxLength, charArray.length);
            for (int j = 0; j < charArray.length; j++) {
                result[i][j] = charArray[j];
            }
        }
        br.close();

        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (result[j][i] == '\0') {
                    continue;
                } else {
                    bw.write(result[j][i]);
                }
            }
        }
        bw.flush();
        bw.close();

    }

}