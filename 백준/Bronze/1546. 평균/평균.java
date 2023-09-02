import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int countSubject = Integer.parseInt(br.readLine());
        float[] subjects = new float[countSubject];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < countSubject; i++) {
            subjects[i] = Float.parseFloat(st.nextToken());
        }
        br.close();

        float max = 0;
        for (int i = 0; i < countSubject; i++) {
            if (subjects[i] > max) {
                max = subjects[i];
            }
        }

        for (int i = 0; i < countSubject; i++) {
            subjects[i] = (subjects[i] / max) * 100;
        }

        float sum = 0;
        for (int i = 0; i < countSubject; i++) {
            sum += subjects[i];
        }
        
        double result = sum / countSubject;
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }

}