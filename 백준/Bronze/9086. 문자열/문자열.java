import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String str = br.readLine();
            String[] splitStr = str.split("");

            bw.write(splitStr[0] + splitStr[splitStr.length - 1] + "\n");
        }
        br.close();
        bw.flush();
        bw.close();

    }

}