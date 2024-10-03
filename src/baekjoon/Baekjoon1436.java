package baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(buffer.readLine());
        int check666Count = 0;
        ArrayList<Integer> save666 = new ArrayList<>();
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            ArrayList<Integer> check = new ArrayList<>();
            int mok = i / 10;
            int nam = i % 10;
            check.add(nam);
            while (mok != 0) {
                check.add(mok % 10);
                mok /= 10;
            }
            int continue3 = 0;
            for (int j = 0; j < check.size(); j++) {
                if (check.get(j) == 6) {
                    continue3++;
                }
                if (continue3 > 0 && check.get(j) != 6) {
                    continue3 = 0;
                }
                if (continue3 == 3) {
                    check666Count++;
                    if (check666Count == N) {
                        System.out.println(i);
                        return;
                    }
                }
            }
        }

    }
}
