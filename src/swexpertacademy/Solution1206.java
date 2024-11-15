package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1206 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 1; t <= 10; t++) {
            int N = Integer.parseInt(bufferedReader.readLine());
            int arr[] = new int[N];
            int result = 0;

            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for (int j = 2; j < N - 2; j++) {
                int max = 0;
                int leftMax = 0;
                int rightMax = 0;
                leftMax = Math.max(arr[j - 2], arr[j - 1]);
                rightMax = Math.max(arr[j + 1], arr[j + 2]);

                max = Math.max(leftMax, rightMax);

                if (max < arr[j]) {
                    result += arr[j] - max;
                }
            }
            System.out.println("#" + t + " " + result);
        }
    }
}
