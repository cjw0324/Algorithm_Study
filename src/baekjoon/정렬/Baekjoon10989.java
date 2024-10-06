package baekjoon.정렬;

import java.io.*;
import java.util.*;

public class Baekjoon10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(buffer.readLine());

        int[] count = new int[10001];

        for (int i = 0; i < N; i++) {
            count[Integer.parseInt(buffer.readLine())]++;
        }
        buffer.close();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            while (count[i] > 0) {
                stringBuilder.append(i).append("\n");
                count[i]--;
            }
        }
        System.out.println(stringBuilder);
    }
}
