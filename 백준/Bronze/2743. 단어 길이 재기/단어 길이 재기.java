import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] splitStr = str.split("");

        int count = 0;
        for (int i = 0; i < splitStr.length; i++) {
            count ++;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();

    }

}