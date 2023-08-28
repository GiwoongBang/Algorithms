import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int a, b;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a * (b % 10));
        System.out.println(a * (int)((b * 0.1) % 10));
        System.out.println(a * (int)((b * 0.01) % 10));
        System.out.println(a * b);


    }
}