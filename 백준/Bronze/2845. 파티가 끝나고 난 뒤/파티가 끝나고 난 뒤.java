import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int participants = Integer.parseInt(st.nextToken());
        int area = Integer.parseInt(st.nextToken());
        int standard = participants * area;

        StringTokenizer medias = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            int estimatedPeople = Integer.parseInt(medias.nextToken());
            bw.write(estimatedPeople - standard + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}