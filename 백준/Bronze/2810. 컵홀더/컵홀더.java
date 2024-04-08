import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
SLLS
 */

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int countSeats = Integer.parseInt(br.readLine());
        char[] seats = br.readLine().toCharArray();
        br.close();

        int cupHolder = 1;
        boolean isRight = false;
        for (int i = 0; i < countSeats; i++) {
            if(seats[i] == 'L') {
                if (!isRight) {
                    isRight = true;
                } else {
                    isRight = false;
                    cupHolder ++;
                }
            } else {
                cupHolder ++;
            }
        }

        if (cupHolder >= countSeats) {
            System.out.print(countSeats);
        } else {
            System.out.print(cupHolder);
        }
    }
}