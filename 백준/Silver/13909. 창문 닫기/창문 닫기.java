import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int students = Integer.parseInt(br.readLine());
        System.out.print((int)Math.sqrt(students));

        }
    }