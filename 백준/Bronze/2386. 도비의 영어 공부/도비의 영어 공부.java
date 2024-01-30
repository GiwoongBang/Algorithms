import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] input = br.readLine().split(" ");

            char[] standared = input[0].toCharArray();
            if (standared[0] == '#') break;

            int result = 0;
            for (int i = 1; i < input.length; i++) {
                char[] charArray = input[i].toLowerCase().toCharArray();
                for (char each : charArray) {
                    if (standared[0] == each) result++;
                }
            }
            bw.write(standared[0] + " " + result + "\n");
            bw.flush();
        }
        br.close();
        bw.close();

    }

}