import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nowTimes = br.readLine().split(":");
        String[] startTimes = br.readLine().split(":");
        br.close();

        int[] nowTime = new int[3];
        int[] startTime = new int[3];

        for (int i = 0; i < 3; i++) {
            nowTime[i] = Integer.parseInt(nowTimes[i]);
        }

        for (int j = 0; j < 3; j++) {
            startTime[j] = Integer.parseInt(startTimes[j]);
        }

        if (startTime[0] > nowTime[0]) {
            int[] resultArr = biggerStartTime(nowTime, startTime);
            setResult(resultArr);
        } else if (startTime[0] < nowTime[0]) {
            int[] resultArr = biggerNowTime(nowTime, startTime);
            setResult(resultArr);
        } else {
            if (startTime[1] > nowTime[1]) {
                int[] resultArr = biggerStartTime(nowTime, startTime);
                setResult(resultArr);
            } else if (startTime[1] < nowTime[1]) {
                int[] resultArr = biggerNowTime(nowTime, startTime);
                setResult(resultArr);
            } else {
                if (startTime[2] > nowTime[2]) {
                    int[] resultArr = biggerStartTime(nowTime, startTime);
                    setResult(resultArr);
                } else if (startTime[2] < nowTime[2]) {
                    int[] resultArr = biggerNowTime(nowTime, startTime);
                    setResult(resultArr);
                }
            }
        }
    }

    private static int[] biggerStartTime(int[] nowTime, int[] startTime) {
        int resultHour = startTime[0] - nowTime[0];
        int resultMin = startTime[1] - nowTime[1];
        int resultSec = startTime[2] - nowTime[2];

        return new int[]{resultHour, resultMin, resultSec};
    }

    private static int[] biggerNowTime(int[] nowTime, int[] startTime) {

        int tempHour = nowTime[0] - startTime[0];
        int tempMin = nowTime[1] - startTime[1];
        int tempSec = nowTime[2] - startTime[2];

        int resultHour = 24 - tempHour;
        int resultMin = -tempMin;
        int resultSec = -tempSec;

        return new int[]{resultHour, resultMin, resultSec};
    }

    private static void setResult(int[] resultArr) {
        if (resultArr[2] < 0) {
            resultArr[1]--;
            resultArr[2] += 60;
        }

        if (resultArr[1] < 0) {
            resultArr[0]--;
            resultArr[1] += 60;
        }

        System.out.printf("%02d:%02d:%02d", resultArr[0], resultArr[1], resultArr[2]);
    }

}