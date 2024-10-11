package baekjoon.집합과맵;

import java.io.*;
import java.util.*;

public class Baekjoon1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);
        HashSet<String> duto = new HashSet<>();
        HashSet<String> bodo = new HashSet<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            duto.add(br.readLine());
        }
        for (int i = 0; i < m; i++) {
            bodo.add(br.readLine());
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<String> result = new ArrayList<>();
        for (String s : duto) {
            if (bodo.contains(s)) {
                count++;
                result.add(s);
            }
        }
        Collections.sort(result);

        System.out.println(count);
        for (String s : result) {
            bw.append(s).append("\n");
        }
        bw.flush();
        bw.close();
    }
}
