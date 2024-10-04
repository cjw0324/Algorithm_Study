package baekjoon.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon1018 {
    public static int min = 64;
    public static char[][] column;
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = buffer.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int M = Integer.parseInt(temp[1]);
        column = new char[N][M];
        for (int i = 0; i < N; i++) {
            String tempCol = buffer.readLine();
            column[i] = tempCol.toCharArray();
        }

        int boundaryX = M-7;
        int boundaryY = N-7;
        for (int i = 0; i < boundaryY; i++) {
            for (int j = 0; j < boundaryX; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }

    public static void find(int x, int y) {
        int endX = x + 7;
        int endY = y + 7;
        int count = 0;
        char color = column[x][y];
        for (int i = x; i <= endX; i++) {
            for (int j = y; j <= endY; j++) {
                if (column[i][j] != color) {
                    count++;
                }
                if (color == 'B') {
                    color = 'W';
                } else {
                    color = 'B';
                }
            }
            if (color == 'B') {
                color = 'W';
            } else {
                color = 'B';
            }
        }
        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }
}
