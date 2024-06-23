import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<String> hs = new HashSet<>();
        int result = 0;

        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; i++) {
            String input = br.readLine();
            if (input.equals("ENTER")) {
                result += hs.size();
                hs = new HashSet<>();
                continue;
            }
            hs.add(input);
        }
        result += hs.size();
        System.out.print(result);

    }
}