import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int caseCount;

        Scanner sc = new Scanner(System.in);
        caseCount = sc.nextInt();

        for (int i = 0; i < caseCount; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a + b);
        }

        sc.close();

    }

}