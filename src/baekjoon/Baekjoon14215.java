package baekjoon;
import java.io.*;
import java.util.*;

public class Baekjoon14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = buffer.readLine().split(" ");
        int[] abc = new int[3];
        for (int i = 0; i < 3; i++) {
            abc[i] = Integer.parseInt(temp[i]);
        }
        Arrays.sort(abc);
        if (abc[0] + abc[1] > abc[2]) {
            System.out.println(abc[0]+abc[1]+abc[2]);
        } else if (abc[0] + abc[1] <= abc[2]) {
            System.out.println(abc[0]+abc[1]+(abc[0]+abc[1])-1);
        }
    }
}




