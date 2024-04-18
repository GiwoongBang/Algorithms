import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String scale = br.readLine().replaceAll(" ", "");

        if(scale.equals("12345678")) {
            System.out.print("ascending");
        } else if (scale.equals("87654321")) {
            System.out.print("descending");
        } else {
            System.out.print("mixed");
        }
        
    }
}