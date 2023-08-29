import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int byteNum;

        Scanner sc = new Scanner(System.in);
        byteNum = sc.nextInt();
        sc.close();

        int count = byteNum / 4;

        for (int i = 0; i < count; i++) {
            System.out.print("long ");
        }

        System.out.print("int");



    }

}