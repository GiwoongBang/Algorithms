import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        boolean isFind = false;
        HashSet<String> hs = new HashSet<>();

        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; i++) {
            st = new StringTokenizer(br.readLine());
            String rabbitA = st.nextToken();
            String rabbitB = st.nextToken();

            if (!isFind) {
                if (rabbitA.equals("ChongChong") || rabbitB.equals("ChongChong")) {
                    hs.add(rabbitA);
                    hs.add(rabbitB);
                    isFind = true;
                }
            } else {
                if (hs.contains(rabbitA)) {
                    hs.add(rabbitB);
                    continue;
                }

                if (hs.contains(rabbitB)) {
                    hs.add(rabbitA);
                }
            }
        }
        System.out.print(hs.size());

    }
}