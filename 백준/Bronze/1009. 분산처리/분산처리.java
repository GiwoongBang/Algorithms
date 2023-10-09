import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = 1;

            for (int j = 0; j < b; j++) {
                result = (result * a) % 10;
            }

            result = result == 0 ? 10 : result;
            System.out.println(result);
        }

    }

}