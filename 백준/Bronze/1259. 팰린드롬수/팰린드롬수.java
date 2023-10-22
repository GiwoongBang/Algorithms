import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            String num = br.readLine();
            if (num.equals("0")) {
                break;
            }

            char[] numArr = num.toCharArray();
            int loop = numArr.length / 2;
            int lastIndex = numArr.length - 1;
            int count = 0;
            for (int i = 0; i < loop; i++) {
                if (numArr[i] != numArr[lastIndex]) {
                    bw.write("no\n");
                    count++;
                    break;
                }
                lastIndex--;
            }
            if (count == 0) {
                bw.write("yes\n");
            }

            count = 0;

        } while (true);

        br.close();
        bw.flush();
        bw.close();

    }

}