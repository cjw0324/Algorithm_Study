package baekjoon.집합과맵;

import java.io.*;
import java.util.*;
public class Baekjoon11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int n = input.length();

        int count = 0;

        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < n; i++) {         // i = 0,1,2,3,4
            for (int j = i+1; j <= n; j++) {  // 0 -> j = 1,2,3,4,5
                                              // 1 -> j = 2,3,4,5
                                              // 2 -> j = 3,4,5
                                              //3 -> j = 4,5
                                              //4 -> j = 5
                hashSet.add(input.substring(i, j));
            }
        }
        System.out.println(hashSet.size());
    }
}
