package baekjoon.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int avg = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(buffer.readLine());
            avg += arr[i];
        }
        Arrays.sort(arr);
        avg /= 5;
        System.out.println(avg);
        System.out.println(arr[2]);
    }
}
