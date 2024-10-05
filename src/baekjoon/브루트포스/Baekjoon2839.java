package baekjoon.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        int max = 1667;
        int x = 0, y = 0;
        for (int i = 0; i < 1667; i++) {
            for (int j = 0; j < 1001; j++) {
                int sum = i * 3 + j * 5;
                if (sum == N && max > i + j) {
                    max = i + j;
                    x = i;
                    y = j;
                }
            }
        }
        if (max == 1667) {
            System.out.println("-1");
        } else {
            System.out.println(x + y);
        }
    }
}
