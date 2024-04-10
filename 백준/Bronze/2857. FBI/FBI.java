import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int countAgent = 0;

        int loop = 5;
        for (int i = 0; i < loop; i++) {
            String agent = br.readLine();
            if (agent.contains("FBI")) {
                countAgent ++;
                bw.write((i + 1) + " ");
            }
        }

        if (countAgent != 0) {
            br.close();
            bw.flush();
            bw.close();
        } else {
            br.close();
            System.out.print("HE GOT AWAY!");
            bw.close();
        }
    }
}