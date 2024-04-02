import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());
        for (int i = loop; i > 0; i--) {
            bw.write(i+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}