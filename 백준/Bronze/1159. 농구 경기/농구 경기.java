import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] alphabet = new int[26];
        StringBuilder result = new StringBuilder();

        int allPlayers = Integer.parseInt(br.readLine());
        for (int i = 0; i < allPlayers; i++) {
            char[] playerName = br.readLine().toCharArray();
            int alphabetIndex = playerName[0] - 97;
            alphabet[alphabetIndex]++;
        }
        br.close();

        for (int j = 0; j < alphabet.length; j++) {
            if (alphabet[j] >= 5) {
                result.append((char) (j + 97));
            }
        }

        if (result.toString().equals("")) {
            bw.write("PREDAJA");
        } else {
            bw.write(result.toString());
        }

        bw.flush();
        bw.close();

    }

}