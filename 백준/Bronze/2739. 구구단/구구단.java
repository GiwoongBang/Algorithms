import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int dan;

        Scanner sc = new Scanner(System.in);
        dan = sc.nextInt();

        for (int i = 1; i < 10; i++) {

            System.out.println(dan + " * " + i + " = " + dan * i);
        }

    }

}