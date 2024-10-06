package baekjoon.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Baekjoon1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(buffer.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = buffer.readLine();
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1.length() - o2.length()) != 0 ? o1.length() - o2.length() : o1.compareTo(o2);
            }
        });
        buffer.close();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                stringBuilder.append(arr[i]).append("\n");
            }
            if (i > 0 && arr[i].compareTo(arr[i - 1]) != 0) {
                stringBuilder.append(arr[i]).append("\n");
            }
        }
        System.out.println(stringBuilder);
    }
}
