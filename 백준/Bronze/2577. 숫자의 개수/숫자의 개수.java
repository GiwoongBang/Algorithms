import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        int num = A * B * C;
        int[] result = new int[10];

        do {
            int index = num % 10;
            result[index]++;
            num = num / 10;
        } while (num != 0);

        for (int i = 0; i < 9; i++) {
            System.out.println(result[i]);
        }
        System.out.print(result[9]);

    }

}