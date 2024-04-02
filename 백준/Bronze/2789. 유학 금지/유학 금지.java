import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        char[] standard = {'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E'};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] strArray = br.readLine().toCharArray();
        br.close();

        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < standard.length; j++) {
                if (strArray[i] == standard[j]) {
                    strArray[i] = 'x';
                    break;
                }
            }
        }

        for (int k = 0; k < strArray.length; k++) {
            if(strArray[k] != 'x') System.out.print(strArray[k]);
        }
    }
}