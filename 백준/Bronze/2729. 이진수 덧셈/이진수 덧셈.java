import java.io.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; i++) {
            String[] binaryNums = br.readLine().split(" ");
            BigInteger numA = new BigInteger(binaryNums[0], 2);
            BigInteger numB = new BigInteger(binaryNums[1], 2);
            BigInteger sum = numA.add(numB);

            String result = sum.toString(2);
            bw.write(result + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}