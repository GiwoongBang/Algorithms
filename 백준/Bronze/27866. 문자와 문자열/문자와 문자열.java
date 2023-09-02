import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] splitStr = str.split("");

        int index = Integer.parseInt(br.readLine());
        br.close();

        bw.write(splitStr[index - 1]);
        bw.flush();
        bw.close();

    }

}