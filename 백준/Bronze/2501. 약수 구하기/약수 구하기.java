import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int num = Integer.parseInt(st.nextToken());
        int th = Integer.parseInt(st.nextToken());

        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisors.add(i);
            }
        }

        if (divisors.size() < th) {
            System.out.print(0);
        } else {
            Collections.sort(divisors);
            System.out.print(divisors.get(th - 1));
        }
    }

}