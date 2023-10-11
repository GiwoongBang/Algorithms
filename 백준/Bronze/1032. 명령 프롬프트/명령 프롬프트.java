import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputsNum = Integer.parseInt(br.readLine());

        char[] reference = br.readLine().toCharArray();

        if (inputsNum == 1) {
            br.close();
            bw.write(reference);
        } else {
            for (int i = 0; i < inputsNum - 1; i++) {
                char[] compare = br.readLine().toCharArray();
                for (int j = 0; j < compare.length; j++) {
                    if (reference[j] != compare[j]) {
                        reference[j] = '?';
                    }
                }
            }
            br.close();
            bw.write(reference);
        }
        bw.flush();
        bw.close();

    }

}