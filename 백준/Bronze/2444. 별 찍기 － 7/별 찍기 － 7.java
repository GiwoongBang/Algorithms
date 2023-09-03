import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int starCount = Integer.parseInt(br.readLine());
        br.close();

        int line = (2 * starCount) - 1;

        int star = 1;
        int blank = starCount - 1;

        int before = line / 2 + 1;
        int after = line / 2;

        for (int i = 0; i < before; i++) {
            for (int b = 0; b < blank; b++) {
                bw.write(" ");
            }
            for (int s = 0; s < star; s++) {
                bw.write("*");
            }
            bw.write("\n");
            star += 2; blank -= 1;
        }

        star -= 2; blank +=1;
        for (int i = 0; i < after; i++) {
            star -= 2; blank += 1;
            for (int b = 0; b < blank; b++) {
                bw.write(" ");
            }
            for (int s = 0; s < star; s++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}