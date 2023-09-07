import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int quarter, dime, nickel, penny;

        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            int charge = Integer.parseInt(br.readLine());
            quarter = charge / 25;
            dime = (charge % 25) / 10;
            nickel = ((charge % 25) % 10) / 5;
            penny = ((charge % 25) % 10) % 5;

            bw.write(quarter + " " + dime + " " + nickel + " " + penny + "\n");
        }
        br.close();
        bw.flush();
        bw.close();

    }

}