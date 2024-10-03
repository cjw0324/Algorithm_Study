package baekjoon;
import java.io.*;
import java.util.*;

public class Baekjoon9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(buffer.readLine());
        if (N == 1) {
            System.out.println("0");
            return;
        }
        ArrayList<Integer> xList = new ArrayList<Integer>();
        ArrayList<Integer> yList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] temp = buffer.readLine().split(" ");
            xList.add(Integer.parseInt(temp[0]));
            yList.add(Integer.parseInt(temp[1]));
        }
        int xMax = Collections.max(xList);
        int yMax = Collections.max(yList);
        int xMin = Collections.min(xList);
        int yMin = Collections.min(yList);

        System.out.println((xMax-xMin)*(yMax-yMin));
    }
}


