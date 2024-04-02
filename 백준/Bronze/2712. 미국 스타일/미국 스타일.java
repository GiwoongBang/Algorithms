import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; i++) {
            String[] input = br.readLine().split(" ");
            double amount = Double.parseDouble(input[0]);
            String unit = input[1];

            conversionUint(bw, amount, unit);
        }
        br.close();
        bw.flush();
        bw.close();
    }

    private static void conversionUint(BufferedWriter bw, double amount, String unit) throws IOException {
        double conversionVal;

        if (unit.equals("kg")) {
            conversionVal = amount * 2.2046;
            bw.write(String.format("%.4f lb\n", conversionVal));
        }

        if (unit.equals("lb")) {
            conversionVal = amount * 0.4536;
            bw.write(String.format("%.4f kg\n", conversionVal));
        }

        if (unit.equals("l")) {
            conversionVal = amount * 0.2642;
            bw.write(String.format("%.4f g\n", conversionVal));
        }

        if (unit.equals("g")) {
            conversionVal = amount * 3.7854;
            bw.write(String.format("%.4f l\n", conversionVal));
        }
    }
}