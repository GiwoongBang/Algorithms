import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int songs = Integer.parseInt(input[0]);
        int avg = Integer.parseInt(input[1]);

        if(avg == 100) {
            System.out.print(songs * avg);
        } else {
            System.out.print((songs * (avg - 1)) + 1);
        }
    }
}