import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();

        int index = 1;
        int temp = index;
        while (true) {
            temp += 6 * index;
            if(N <= temp) break;
            index ++;
        }

        if (N == 1) {
            System.out.print(1);
        } else {
            System.out.print(index + 1);
        }

    }

}