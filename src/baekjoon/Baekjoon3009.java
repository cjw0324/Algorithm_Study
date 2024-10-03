package baekjoon;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Baekjoon3009 {
    public static void main(String[] args) throws IOException{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int[] xList = new int[3];
        int[] yList = new int[3];

        for (int i = 0; i < 3; i++) {
            String[] temp = buffer.readLine().split(" ");
            xList[i] = Integer.parseInt(temp[0]);
            yList[i] = Integer.parseInt(temp[1]);
        }

        int x = 0;
        int y = 0;
        if (xList[0] == xList[1]) {
            x = xList[2];
        } else if (xList[0] == xList[2]) {
            x = xList[1];
        } else {
            x = xList[0];
        }

        if (yList[0] == yList[1]) {
            y = yList[2];
        } else if (yList[0] == yList[2]) {
            y = yList[1];
        } else {
            y = yList[0];
        }

        System.out.println(x + " " + y);
    }


}



