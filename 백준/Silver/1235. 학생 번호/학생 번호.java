import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int students = Integer.parseInt(br.readLine());
        String[] studentNums = new String[students];
        for (int i = 0; i < students; i++) {
            studentNums[i] = br.readLine();
        }
        br.close();

        int k = 1;
        int stuNumLen = studentNums[0].length();
        int sub = stuNumLen - 1;

        for (int j = 0; j < stuNumLen - 1; j++) {
            List<String> divided = new ArrayList<>();
            for (int t = 0; t < students; t++) {
                String temp = studentNums[t].substring(sub, stuNumLen);
                if (!divided.contains(temp)) {
                    divided.add(temp);
                } else {
                    break;
                }
            }

            if (divided.size() != students) {
                k++;
                sub--;
            } else {
                break;
            }
        }
        System.out.print(k);

    }

}