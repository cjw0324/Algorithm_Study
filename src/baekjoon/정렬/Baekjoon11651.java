package baekjoon.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Baekjoon11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] temp = bufferedReader.readLine().split(" ");
            arr[i][0] = Integer.parseInt(temp[0]);
            arr[i][1] = Integer.parseInt(temp[1]);
        }
        bufferedReader.close();
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]!=o2[1]? o1[1]-o2[1] : o1[0]-o2[0];
            }
        });
        for (int[] ints : arr) {
            System.out.println(ints[0]+" "+ints[1]);
        }
    }
}
