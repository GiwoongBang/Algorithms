import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] students = new int[30];

        for (int i = 0; i < students.length - 2; i++) {
            int studentNum = Integer.parseInt(br.readLine()) - 1;
            students[studentNum] = studentNum + 1;
        }
        br.close();

        int j = 0;
        int[] temp = new int[2];
        for (int i =0; i < students.length; i++) {
            if (students[i] == 0) {
                temp[j] = i + 1;
                j++;
            }
        }

        int max, min;
        if (temp[0] > temp[1]) {
            max = temp[0];
            min = temp[1];
        } else {
            max = temp[1];
            min = temp[0];
        }
        bw.write(min + "\n" + max);
        bw.flush();
        bw.close();
    }
}