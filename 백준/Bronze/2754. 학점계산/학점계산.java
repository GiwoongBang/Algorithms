import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] gradeArray = br.readLine().toCharArray();

        if (gradeArray[0] == 'F') {
            System.out.print(0.0);
        } else {
            int left = 0;
            int right = 0;
            switch (gradeArray[0]) {
                case 'A': left = 4; break;
                case 'B': left = 3; break;
                case 'C': left = 2; break;
                case 'D': left = 1; break;
            }

            switch (gradeArray[1]) {
                case '+': right = 3; break;
                case '0': right = 0; break;
                case '-': right = 7; break;
            }

            if(right == 7) left -= 1;
            System.out.print(left + "." + right);
        }
    }
}