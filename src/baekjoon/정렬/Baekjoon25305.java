package baekjoon.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;

public class Baekjoon25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = buffer.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int k = Integer.parseInt(temp[1]);

        int[] scores = new int[N];
        temp = buffer.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(temp[i]);
        }
        Arrays.sort(scores);
        System.out.println(scores[N-k]);
    }
}
