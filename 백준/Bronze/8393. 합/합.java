import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sum = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sum += i + 1;
        }

        System.out.println(sum);
        sc.close();

    }

}