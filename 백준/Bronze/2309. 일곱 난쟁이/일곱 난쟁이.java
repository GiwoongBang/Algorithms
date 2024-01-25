import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dwarfs = new int[9];
        int sum = 0;
        for (int i = 0; i < dwarfs.length; i++) {
            dwarfs[i] = Integer.parseInt(br.readLine());
            sum += dwarfs[i];
        }
        br.close();

        int exceptions = sum - 100;
        boolean check = false;
        for (int j = 0; j < dwarfs.length - 1; j++) {
            for (int k = j + 1; k < dwarfs.length; k++) {
                if ((dwarfs[j] + dwarfs[k]) == exceptions) {
                    dwarfs[j] = 200;
                    dwarfs[k] = 200;
                    check = true;
                    break;
                }
            }
            if (check) break;
        }
        
        Arrays.sort(dwarfs);
        for(int t = 0; t < dwarfs.length - 2; t++) {
            System.out.println(dwarfs[t]);
        }

    }

}