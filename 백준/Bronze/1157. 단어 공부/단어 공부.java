import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] alphabet = new int[26];
        char[] charArray = br.readLine().toUpperCase().toCharArray();
        br.close();

        for (int i = 0; i < charArray.length; i++) {
            int index = charArray[i] - 65;
            alphabet[index]++;
        }

        int max = Integer.MIN_VALUE;
        char ch = '?';
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                ch = (char) (i + 65);
            } else if (alphabet[i] == max) {
                ch = '?';
            }
        }
        bw.write(ch);
        bw.flush();
        bw.close();

    }

}