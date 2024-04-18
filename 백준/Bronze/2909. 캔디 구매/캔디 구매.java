import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int candyPrice = Integer.parseInt(input[0]);
        int faceVal = Integer.parseInt(input[1]);

        double dividedVal = candyPrice / Math.pow(10, faceVal);
        long roundedVal = Math.round(dividedVal);

        int finalVal = (int)(roundedVal * Math.pow(10, faceVal));
        System.out.print(finalVal);
    }
}