import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int students = Integer.parseInt(st.nextToken());
        String exceptNum = st.nextToken();

        int maxNum = 0;
        for (int i = 0; i < students; i++) {
            while(true) {
                maxNum++;
                boolean isContains = String.valueOf(maxNum).contains(exceptNum);
                if(!isContains) {
                    break;
                }
            }
        }
        System.out.print(maxNum);

    }

}