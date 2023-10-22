import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            String input = br.readLine();
            if (input.equals("#")) {
                break;
            }

            int count = 0;
            char[] charArr = input.toCharArray();
            for (int i = 0; i < charArr.length; i++) {
                if (charArr[i] == 'a' || charArr[i] == 'e' || charArr[i] == 'i' || charArr[i] == 'o' || charArr[i] == 'u' ||
                        charArr[i] == 'A' || charArr[i] == 'E' || charArr[i] == 'I' || charArr[i] == 'O' || charArr[i] == 'U') {
                    count++;
                }
            }
            bw.write(count + "\n");
        } while (true);
        
        br.close();
        bw.flush();
        bw.close();

    }

}