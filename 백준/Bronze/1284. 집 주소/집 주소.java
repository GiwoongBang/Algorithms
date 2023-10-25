import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            int count = 0;
            char[] numArr = br.readLine().toCharArray();
            if (numArr[0] == '0') break;

            for (int i = 0; i < numArr.length; i++) {
                if (numArr[i] == '0') count += 4;
                else if (numArr[i] == '1') count += 2;
                else count += 3;
            }

            int result = count + 2 + (numArr.length - 1);
            bw.write(result + "\n");
        } while (true);
        br.close();
        bw.flush();
        bw.close();

    }

}