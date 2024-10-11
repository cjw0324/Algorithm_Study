package baekjoon.집합과맵;

import java.io.*;
import java.util.*;
public class Baekjoon1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] temp = br.readLine().split(" ");

        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);

        HashSet<String> setA = new HashSet<>();
        HashSet<String> setB = new HashSet<>();
        int countA = 0;
        int countB = 0;
        temp = br.readLine().split(" ");
        for (String s : temp) {
            setA.add(s);
        }
        temp = br.readLine().split(" ");
        for (String s : temp) {
            setB.add(s);
        }

        countA = setA.size();
        countB = setB.size();

        for (String s : setA) {
            if (setB.contains(s)) {
                countB--;
            }
        }
        for (String s : setB) {
            if (setA.contains(s)) {
                countA--;
            }
        }
        br.close();
        bw.write(Integer.toString(countB + countA));
        bw.flush();
        bw.close();

    }
}
