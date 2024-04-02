import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] charArray = br.readLine().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if ((int)charArray[i] - 97 >= 0) {
                bw.write((char)((int)charArray[i] - 32));
            } else {
                bw.write((char)((int)charArray[i] + 32));
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}