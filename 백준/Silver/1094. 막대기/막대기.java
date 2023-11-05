import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        br.close();

        String binaryNum = Integer.toString(num, 2);
        binaryNum = binaryNum.replace("0", "");

        int result = binaryNum.length();
        System.out.print(result);
        
    }

}