package baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = buffer.readLine().split(" ");
        int[] arr = new int[3];
        arr[0] = Integer.parseInt(temp[0]);
        arr[1] = Integer.parseInt(temp[1]);
        arr[2] = Integer.parseInt(temp[2]);
        while (arr[0] + arr[1] + arr[2] != 0) {
            Arrays.sort(arr);

            if (arr[2] >= arr[0] + arr[1]) {
                System.out.println("Invalid");
            } else if (arr[0] == arr[1] && arr[1] == arr[2]) {
                System.out.println("Equilateral");
            } else if (arr[0] != arr[1] && arr[1] != arr[2] && arr[0] != arr[2]) {
                System.out.println("Scalene");
            } else {
                System.out.println("Isosceles");
            }
            temp = buffer.readLine().split(" ");
            arr[0] = Integer.parseInt(temp[0]);
            arr[1] = Integer.parseInt(temp[1]);
            arr[2] = Integer.parseInt(temp[2]);
        }
    }
}



