package baekjoon.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Baekjoon2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(buffer.readLine());

        for (int i = 1; i < N; i++) {
            int mok = i/10;
            int nam = i%10;
            ArrayList<Integer> mList = new ArrayList<>();
            mList.add(nam);
            while (mok != 0) {
                mList.add(mok % 10);
                mok = mok / 10;
            }
            int sum = i;
            for (int j = 0; j < mList.size(); j++) {
                sum += mList.get(j);

            }
            if (sum == N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
