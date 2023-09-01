import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> remainders = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            remainders.add(num % 42);
        }
        br.close();

        bw.write(String.valueOf(remainders.size()));
        bw.flush();
        bw.close();
    }

}