import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] charArray = br.readLine().toCharArray();
        br.close();

        int endIndex = charArray.length - 1;
        int result = 1;

        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[endIndex]) {
                result = 0;
                break;
            }
            endIndex -= 1;
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

}