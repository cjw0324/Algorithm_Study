package baekjoon.집합과맵;

import java.io.*;
import java.util.HashMap;

public class Baekjoon10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> nMap = new HashMap<>();
        String[] temp = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (nMap.containsKey(temp[i])) {
                nMap.put(temp[i], (nMap.get(temp[i])) + 1);
            } else {
                nMap.put(temp[i], 1);
            }
        }
        int m = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        temp = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            Integer count = nMap.get(temp[i]);
            if (count != null) {
                bw.write(Integer.toString(count) + " ");
            } else {
                bw.write("0 ");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
