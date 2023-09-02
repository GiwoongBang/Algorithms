import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        char[] charArray = br.readLine().toCharArray();
        br.close();

        for (int i = 0; i < charArray.length; i++) {
            int index = charArray[i] - 97;

            if (alphabet[index] == -1) {
                alphabet[index] = i;
            }
        }

        for(int i = 0; i < alphabet.length; i++) {
            bw.write(alphabet[i] + " ");
        }
        bw.flush();
        bw.close();

    }

}