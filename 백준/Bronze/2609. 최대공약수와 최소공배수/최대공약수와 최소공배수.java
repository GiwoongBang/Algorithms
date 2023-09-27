import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int multiply = a * b;

        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        int c = 0;
        while (a % b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        int gcd = b;
        int lcm = multiply / b;

        System.out.println(gcd);
        System.out.print(lcm);

    }

}