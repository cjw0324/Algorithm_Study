package baekjoon.집합과맵;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon10815 {
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        st = new StringTokenizer(br.readLine(), " ");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int res = BinarySearch(Integer.parseInt(st.nextToken()));
            if (res != -1) {
                stringBuilder.append(1).append(" ");
            } else {
                stringBuilder.append(0).append(" ");
            }
        }
        System.out.println(stringBuilder);
    }

    public static int BinarySearch(int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
