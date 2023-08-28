import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c;
        int prize = 0;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a == b && b == c) {
            prize = 10000 + (a * 1000);
        } else if (a != b && a != c && b != c) {
            prize = (Math.max(Math.max(a, b), c)) * 100;
        } else if ((a == b && c != b) || (a == c && b != c)) {
            prize = 1000 + a * 100;
        } else if (b == c && a != c) {
            prize = 1000 + b * 100;
        }

        System.out.println(prize);
    }

}