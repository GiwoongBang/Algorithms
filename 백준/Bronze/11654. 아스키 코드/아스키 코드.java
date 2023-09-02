import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int charToint = (byte) br.readLine().charAt(0);
        br.close();

        bw.write(String.valueOf(charToint));
        bw.flush();
        bw.close();

    }

}