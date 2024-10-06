package baekjoon.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Baekjoon1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(buffer.readLine());

        int mok = N;
        ArrayList<Integer> arr = new ArrayList<>();
        while (mok != 0) {
            arr.add(mok % 10);
            mok /= 10;
        }
        Collections.sort(arr);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = arr.size() - 1; i >= 0; i--) {
            stringBuilder.append(arr.get(i));
        }
        System.out.println(stringBuilder);

    }
}
