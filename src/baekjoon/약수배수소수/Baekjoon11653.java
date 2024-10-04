package baekjoon.약수배수소수;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
public class Baekjoon11653 {
    public static void main(String[] args) throws IOException{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(buffer.readLine());
        if (N == 1) {
            return;
        }
        for (int i = 2; i <= N; i++) {
            while (N % i == 0) {
                N = N / i;
                System.out.println(i);
            }
        }
    }
}
