import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        String[] grades = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+", "D0", "D-", "F"};
        double[] scores = {4.3, 4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0};

        int creditSum = 0;
        double gradeSum = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; i++) {
            String[] subject = br.readLine().split(" ");
            int credit = Integer.parseInt(subject[1]);
            String grade = subject[2];


            creditSum += credit;
            for (int j = 0; j < grades.length; j++) {
                if (grades[j].equals(grade)) {
                    gradeSum += credit * scores[j];
                    break;
                }
            }
        }
        double result = Math.round(gradeSum / creditSum * 100);
        System.out.printf("%.2f", result / 100);
    }
}