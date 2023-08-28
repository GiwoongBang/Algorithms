import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int buddhaYear, adYear;
        Scanner sc = new Scanner(System.in);
        buddhaYear = sc.nextInt();
        adYear = buddhaYear - 543;
        
        System.out.println(adYear);

    }
}