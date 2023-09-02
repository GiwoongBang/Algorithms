import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().strip().split(" ");

        int count = 0;
        if (str[0] == "" || str[0] == " ") {
            count = 0;
        } else {
            for (int i = 0; i < str.length; i++) {
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();

    }

}