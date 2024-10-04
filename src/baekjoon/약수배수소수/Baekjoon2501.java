package baekjoon.약수배수소수;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Baekjoon2501 {
    public static void main(String[] args) throws IOException{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = buffer.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int K = Integer.parseInt(temp[1]);

        ArrayList<Integer> yacksu = new ArrayList<Integer>();
        for (int i = 1; i < N + 1; i++) {
            if (N % i == 0) {
                yacksu.add(i);
            }
        }
        if (K > yacksu.size()) {
            System.out.println("0");
        } else {
            System.out.println(yacksu.get(K-1));
        }

    }
}
